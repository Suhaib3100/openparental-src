package c8;

import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.flyco.tablayout.widget.MsgView;

/* compiled from: UnreadMsgUtils.java */
/* loaded from: classes5.dex */
public class b {
    public static void a(MsgView msgView, int i4) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        msgView.setLayoutParams(layoutParams);
    }

    public static void b(MsgView msgView, int i4) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        DisplayMetrics displayMetrics = msgView.getResources().getDisplayMetrics();
        msgView.setVisibility(0);
        if (i4 <= 0) {
            msgView.o(0);
            msgView.setText("");
            float f4 = displayMetrics.density;
            layoutParams.width = (int) (f4 * 8.0f);
            layoutParams.height = (int) (f4 * 8.0f);
            msgView.setLayoutParams(layoutParams);
            return;
        }
        float f5 = displayMetrics.density;
        layoutParams.height = (int) (f5 * 18.0f);
        if (i4 > 0 && i4 < 10) {
            layoutParams.width = (int) (f5 * 18.0f);
            msgView.setText(i4 + "");
        } else if (i4 <= 9 || i4 >= 100) {
            layoutParams.width = -2;
            msgView.setPadding((int) (f5 * 6.0f), 0, (int) (f5 * 6.0f), 0);
            msgView.setText(ProtectedSandApp.s("鐜"));
        } else {
            layoutParams.width = -2;
            msgView.setPadding((int) (f5 * 6.0f), 0, (int) (f5 * 6.0f), 0);
            msgView.setText(i4 + "");
        }
        msgView.setLayoutParams(layoutParams);
    }
}
