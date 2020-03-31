/*
 * Copyright 2017 Akhil Kedia
 * This file is part of AllTrans.
 *
 * AllTrans is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AllTrans is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AllTrans. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package akhil.alltrans;

import android.app.Application;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;

class appOnCreateHookHandler extends XC_MethodHook {
    @Override
    protected void beforeHookedMethod(MethodHookParam methodHookParam) {
        XposedBridge.log("AllTrans: in OnCreate of Application");
        Application application = (Application) methodHookParam.thisObject;

        MyActivityLifecycleCallbacks myActivityLifecycleCallbacks = new MyActivityLifecycleCallbacks();
        application.registerActivityLifecycleCallbacks(myActivityLifecycleCallbacks);
    }

}