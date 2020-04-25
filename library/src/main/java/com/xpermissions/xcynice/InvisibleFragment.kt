package com.xpermissions.xcynice

import android.content.pm.PackageManager
import androidx.fragment.app.Fragment


/**
 * created by xucanyou666
 * on 2020/4/23 19:21
 * email：913710642@qq.com
 */

typealias PermissionCallback = (Boolean, List<String>) -> Unit

class InvisibleFragment : Fragment() {

    private var callback: PermissionCallback? = null

    fun requestNow(cb: PermissionCallback, vararg permission: String) {
        callback = cb
        requestPermissions(permission, 1)
    }

    /**
     * 请求返回结果
     * @param requestCode Int 请求码
     * @param permissions Array<String> 权限
     * @param grantResults IntArray 请求结果
     */
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == 1) {
            val deniedList = ArrayList<String>()
            for ((index, result) in grantResults.withIndex()) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    deniedList.add(permissions[index])
                }
            }
            val allGranted = deniedList.isEmpty()
            //对申请权限的结果进行回调
            callback?.let { it(allGranted, deniedList) }
        }
    }
}