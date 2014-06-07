/*
 *  Pedometer - Android App
 *  Copyright (C) 2009 Levente Bagi
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package name.bagi.levente.pedometer;

import android.content.Context;
import android.os.Vibrator;

/**
 * Vibrates whenever a step is detected.
 * Normally, this is not attached, used for debugging purposes.
 * @author Levente Bagi
 */
public class StepBuzzer implements StepListener {
    /*
     * Context提供了关于应用环境全局信息的接口。它是一个抽象类，它的执行被Android系统所提供。
     * 它允许获取以应用为特征的资源和类型。
     * 同时启动应用级的操作，如启动Activity，broadcasting和接收intents。
     */
    private Context mContext;   
    private Vibrator mVibrator; //设置震动事件
    
    public StepBuzzer(Context context) {
        mContext = context;
        mVibrator = (Vibrator)mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }
    
    public void onStep() {
        buzz();
    }
    
    public void passValue() {
        
    }
    
    private void buzz() {
        mVibrator.vibrate(50);
    }
}

