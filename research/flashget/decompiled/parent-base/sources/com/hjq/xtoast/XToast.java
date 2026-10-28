package com.hjq.xtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.flashget.kid.common.ui.base.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.hjq.xtoast.XToast;
import com.hjq.xtoast.draggable.BaseDraggable;
import com.hjq.xtoast.draggable.MovingDraggable;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* loaded from: classes6.dex */
public class XToast<X extends XToast<?>> implements Runnable {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private Context mContext;
    private ViewGroup mDecorView;
    private BaseDraggable mDraggable;
    private int mDuration;
    private ActivityLifecycle mLifecycle;
    private OnLifecycle mListener;
    private boolean mShowing;
    private WindowManager mWindowManager;
    private WindowManager.LayoutParams mWindowParams;

    public interface OnClickListener<V extends View> {
        void onClick(XToast<?> xToast, V v4);
    }

    public interface OnLifecycle {
        default void onDismiss(XToast<?> xToast) {
        }

        default void onRecycler(XToast<?> xToast) {
        }

        default void onShow(XToast<?> xToast) {
        }
    }

    public interface OnLongClickListener<V extends View> {
        boolean onLongClick(XToast<?> xToast, V v4);
    }

    public interface OnTouchListener<V extends View> {
        boolean onTouch(XToast<?> xToast, V v4, MotionEvent motionEvent);
    }

    public XToast(Activity activity) {
        this((Context) activity);
        if ((activity.getWindow().getAttributes().flags & 1024) != 0 || (activity.getWindow().getDecorView().getSystemUiVisibility() & 4) != 0) {
            addWindowFlags(1024);
        }
        this.mLifecycle = new ActivityLifecycle(this, activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X addWindowFlags(int i4) {
        WindowManager.LayoutParams layoutParams = this.mWindowParams;
        layoutParams.flags = i4 | layoutParams.flags;
        update();
        return this;
    }

    public void cancel() {
        if (this.mShowing) {
            try {
                try {
                    ActivityLifecycle activityLifecycle = this.mLifecycle;
                    if (activityLifecycle != null) {
                        activityLifecycle.unregister();
                    }
                    this.mWindowManager.removeViewImmediate(this.mDecorView);
                    removeCallbacks(this);
                    OnLifecycle onLifecycle = this.mListener;
                    if (onLifecycle != null) {
                        onLifecycle.onDismiss(this);
                    }
                } catch (Throwable th) {
                    this.mShowing = false;
                    throw th;
                }
            } catch (IllegalArgumentException e4) {
                e = e4;
                e.printStackTrace();
                this.mShowing = false;
            } catch (IllegalStateException e5) {
                e = e5;
                e.printStackTrace();
                this.mShowing = false;
            } catch (NullPointerException e6) {
                e = e6;
                e.printStackTrace();
                this.mShowing = false;
            }
            this.mShowing = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X clearWindowFlags(int i4) {
        WindowManager.LayoutParams layoutParams = this.mWindowParams;
        layoutParams.flags = (~i4) & layoutParams.flags;
        update();
        return this;
    }

    public <V extends View> V findViewById(int i4) {
        return (V) this.mDecorView.findViewById(i4);
    }

    public View getContentView() {
        if (this.mDecorView.getChildCount() == 0) {
            return null;
        }
        return this.mDecorView.getChildAt(0);
    }

    public Context getContext() {
        return this.mContext;
    }

    public View getDecorView() {
        return this.mDecorView;
    }

    public Handler getHandler() {
        return HANDLER;
    }

    public WindowManager getWindowManager() {
        return this.mWindowManager;
    }

    public WindowManager.LayoutParams getWindowParams() {
        return this.mWindowParams;
    }

    public boolean hasWindowFlags(int i4) {
        return (i4 & this.mWindowParams.flags) != 0;
    }

    public boolean isShowing() {
        return this.mShowing;
    }

    public boolean post(Runnable runnable) {
        return postDelayed(runnable, 0L);
    }

    public boolean postAtTime(Runnable runnable, long j4) {
        return HANDLER.postAtTime(runnable, this, j4);
    }

    public boolean postDelayed(Runnable runnable, long j4) {
        if (j4 < 0) {
            j4 = 0;
        }
        return postAtTime(runnable, SystemClock.uptimeMillis() + j4);
    }

    public void recycle() {
        if (isShowing()) {
            cancel();
        }
        OnLifecycle onLifecycle = this.mListener;
        if (onLifecycle != null) {
            onLifecycle.onRecycler(this);
        }
        this.mListener = null;
        this.mContext = null;
        this.mDecorView = null;
        this.mWindowManager = null;
        this.mWindowParams = null;
        this.mLifecycle = null;
        this.mDraggable = null;
    }

    public void removeCallbacks(Runnable runnable) {
        HANDLER.removeCallbacks(runnable);
    }

    public void removeCallbacksAndMessages() {
        HANDLER.removeCallbacksAndMessages(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setAnimStyle(int i4) {
        this.mWindowParams.windowAnimations = i4;
        update();
        return this;
    }

    public X setBackground(int i4, int i5) {
        return setBackground(i4, this.mContext.getDrawable(i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setBackgroundDimAmount(float f4) {
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᑡ\u0001"));
        }
        this.mWindowParams.dimAmount = f4;
        if (f4 != 0.0f) {
            addWindowFlags(2);
        } else {
            clearWindowFlags(2);
        }
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setBitmapFormat(int i4) {
        this.mWindowParams.format = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setBlurBehindRadius(int i4) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.mWindowParams.setBlurBehindRadius(i4);
            addWindowFlags(4);
            update();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setButtonBrightness(float f4) {
        this.mWindowParams.buttonBrightness = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setColorMode(int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mWindowParams.setColorMode(i4);
            update();
        }
        return this;
    }

    public X setContentView(int i4) {
        return setContentView(LayoutInflater.from(this.mContext).inflate(i4, this.mDecorView, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setDecorView(ViewGroup viewGroup) {
        this.mDecorView = viewGroup;
        return this;
    }

    public X setDraggable() {
        return setDraggable(new MovingDraggable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setDuration(int i4) {
        this.mDuration = i4;
        if (isShowing() && this.mDuration != 0) {
            removeCallbacks(this);
            postDelayed(this, this.mDuration);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setGravity(int i4) {
        this.mWindowParams.gravity = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setHeight(int i4) {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        this.mWindowParams.height = i4;
        if (this.mDecorView.getChildCount() > 0 && (layoutParams = (childAt = this.mDecorView.getChildAt(0)).getLayoutParams()) != null && layoutParams.height != i4) {
            layoutParams.height = i4;
            childAt.setLayoutParams(layoutParams);
        }
        update();
        return this;
    }

    public X setHint(int i4, int i5) {
        return setHint(i4, this.mContext.getResources().getString(i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setHintColor(int i4, int i5) {
        ((TextView) findViewById(i4)).setHintTextColor(i5);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setHorizontalMargin(float f4) {
        this.mWindowParams.horizontalMargin = f4;
        update();
        return this;
    }

    public X setImageDrawable(int i4, int i5) {
        return setImageDrawable(i4, this.mContext.getDrawable(i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setLayoutInDisplayCutoutMode(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            e.a(this.mWindowParams, i4);
            update();
        }
        return this;
    }

    public X setOnClickListener(OnClickListener<? extends View> onClickListener) {
        return setOnClickListener(this.mDecorView, onClickListener);
    }

    public X setOnLongClickListener(OnLongClickListener<? extends View> onLongClickListener) {
        return setOnLongClickListener(this.mDecorView, onLongClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setOnToastLifecycle(OnLifecycle onLifecycle) {
        this.mListener = onLifecycle;
        return this;
    }

    public X setOnTouchListener(OnTouchListener<? extends View> onTouchListener) {
        return setOnTouchListener(this.mDecorView, onTouchListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setOutsideTouchable(boolean z4) {
        if (z4) {
            addWindowFlags(40);
        } else {
            clearWindowFlags(40);
        }
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setPreferredDisplayModeId(int i4) {
        this.mWindowParams.preferredDisplayModeId = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setPreferredRefreshRate(float f4) {
        this.mWindowParams.preferredRefreshRate = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setScreenBrightness(float f4) {
        this.mWindowParams.screenBrightness = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setScreenOrientation(int i4) {
        this.mWindowParams.screenOrientation = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setSoftInputMode(int i4) {
        this.mWindowParams.softInputMode = i4;
        clearWindowFlags(8);
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setSystemUiVisibility(int i4) {
        this.mWindowParams.systemUiVisibility = i4;
        update();
        return this;
    }

    public X setText(int i4) {
        return setText(android.R.id.message, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setTextColor(int i4, int i5) {
        ((TextView) findViewById(i4)).setTextColor(i5);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setVerticalMargin(float f4) {
        this.mWindowParams.verticalMargin = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setVerticalWeight(float f4) {
        this.mWindowParams.verticalWeight = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setVisibility(int i4, int i5) {
        findViewById(i4).setVisibility(i5);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWidth(int i4) {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        this.mWindowParams.width = i4;
        if (this.mDecorView.getChildCount() > 0 && (layoutParams = (childAt = this.mDecorView.getChildAt(0)).getLayoutParams()) != null && layoutParams.width != i4) {
            layoutParams.width = i4;
            childAt.setLayoutParams(layoutParams);
        }
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowAlpha(float f4) {
        this.mWindowParams.alpha = f4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowFlags(int i4) {
        this.mWindowParams.flags = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowParams(WindowManager.LayoutParams layoutParams) {
        this.mWindowParams = layoutParams;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowTitle(CharSequence charSequence) {
        this.mWindowParams.setTitle(charSequence);
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowToken(IBinder iBinder) {
        this.mWindowParams.token = iBinder;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setWindowType(int i4) {
        this.mWindowParams.type = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setXOffset(int i4) {
        this.mWindowParams.x = i4;
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setYOffset(int i4) {
        this.mWindowParams.y = i4;
        update();
        return this;
    }

    public void show() {
        if (this.mDecorView.getChildCount() == 0 || this.mWindowParams == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᑢ\u0001"));
        }
        if (this.mShowing) {
            update();
            return;
        }
        Context context = this.mContext;
        if ((context instanceof Activity) && (((Activity) context).isFinishing() || ((Activity) this.mContext).isDestroyed())) {
            return;
        }
        try {
            if (this.mDecorView.getParent() != null) {
                this.mWindowManager.removeViewImmediate(this.mDecorView);
            }
            this.mWindowManager.addView(this.mDecorView, this.mWindowParams);
            this.mShowing = true;
            if (this.mDuration != 0) {
                removeCallbacks(this);
                postDelayed(this, this.mDuration);
            }
            BaseDraggable baseDraggable = this.mDraggable;
            if (baseDraggable != null) {
                baseDraggable.start(this);
            }
            ActivityLifecycle activityLifecycle = this.mLifecycle;
            if (activityLifecycle != null) {
                activityLifecycle.register();
            }
            OnLifecycle onLifecycle = this.mListener;
            if (onLifecycle != null) {
                onLifecycle.onShow(this);
            }
        } catch (WindowManager.BadTokenException e4) {
            e = e4;
            e.printStackTrace();
        } catch (IllegalArgumentException e5) {
            e = e5;
            e.printStackTrace();
        } catch (IllegalStateException e6) {
            e = e6;
            e.printStackTrace();
        } catch (NullPointerException e7) {
            e = e7;
            e.printStackTrace();
        }
    }

    public void showAsDropDown(View view) {
        showAsDropDown(view, 80);
    }

    public void startActivity(Class<? extends Activity> cls) {
        startActivity(new Intent(this.mContext, cls));
    }

    public void update() {
        if (isShowing()) {
            this.mWindowManager.updateViewLayout(this.mDecorView, this.mWindowParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setContentView(View view) {
        int i4;
        if (this.mDecorView.getChildCount() > 0) {
            this.mDecorView.removeAllViews();
        }
        this.mDecorView.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        WindowManager.LayoutParams layoutParams2 = this.mWindowParams;
        if (layoutParams2.gravity == 0) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int i5 = ((FrameLayout.LayoutParams) layoutParams).gravity;
                if (i5 != -1) {
                    layoutParams2.gravity = i5;
                }
            } else if ((layoutParams instanceof LinearLayout.LayoutParams) && (i4 = ((LinearLayout.LayoutParams) layoutParams).gravity) != -1) {
                layoutParams2.gravity = i4;
            }
            if (layoutParams2.gravity == 0) {
                layoutParams2.gravity = 17;
            }
        }
        if (layoutParams != null) {
            int i6 = layoutParams2.width;
            if (i6 == -2 && layoutParams2.height == -2) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams.width = i6;
                layoutParams.height = layoutParams2.height;
            }
        }
        update();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setDraggable(BaseDraggable baseDraggable) {
        clearWindowFlags(16);
        clearWindowFlags(512);
        this.mDraggable = baseDraggable;
        if (isShowing()) {
            update();
            this.mDraggable.start(this);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setHint(int i4, CharSequence charSequence) {
        ((TextView) findViewById(i4)).setHint(charSequence);
        return this;
    }

    public X setOnClickListener(int i4, OnClickListener<? extends View> onClickListener) {
        return setOnClickListener(findViewById(i4), onClickListener);
    }

    public X setOnLongClickListener(int i4, OnLongClickListener<? extends View> onLongClickListener) {
        return setOnLongClickListener(findViewById(i4), onLongClickListener);
    }

    public X setOnTouchListener(int i4, OnTouchListener<? extends View> onTouchListener) {
        return setOnTouchListener(findViewById(i4), onTouchListener);
    }

    public X setText(int i4, int i5) {
        return setText(i4, this.mContext.getResources().getString(i5));
    }

    public void showAsDropDown(View view, int i4) {
        showAsDropDown(view, i4, 0, 0);
    }

    public void startActivity(Intent intent) {
        if (!(this.mContext instanceof Activity)) {
            intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
        }
        this.mContext.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X setOnClickListener(View view, OnClickListener<? extends View> onClickListener) {
        clearWindowFlags(16);
        view.setClickable(true);
        view.setOnClickListener(new ViewClickWrapper(this, onClickListener));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X setOnLongClickListener(View view, OnLongClickListener<? extends View> onLongClickListener) {
        clearWindowFlags(16);
        view.setClickable(true);
        view.setOnLongClickListener(new ViewLongClickWrapper(this, onLongClickListener));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X setOnTouchListener(View view, OnTouchListener<? extends View> onTouchListener) {
        clearWindowFlags(16);
        view.setEnabled(true);
        view.setOnTouchListener(new ViewTouchWrapper(this, onTouchListener));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setBackground(int i4, Drawable drawable) {
        findViewById(i4).setBackground(drawable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setImageDrawable(int i4, Drawable drawable) {
        ((ImageView) findViewById(i4)).setImageDrawable(drawable);
        return this;
    }

    public X setText(CharSequence charSequence) {
        return setText(android.R.id.message, charSequence);
    }

    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (this.mDecorView.getChildCount() != 0 && this.mWindowParams != null) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, view.getResources().getConfiguration().getLayoutDirection());
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            WindowManager.LayoutParams layoutParams = this.mWindowParams;
            layoutParams.gravity = BadgeDrawable.f52614s;
            int i7 = (iArr[0] - rect.left) + i5;
            layoutParams.x = i7;
            layoutParams.y = (iArr[1] - rect.top) + i6;
            if ((absoluteGravity & 3) == 3) {
                int width = this.mDecorView.getWidth();
                if (width == 0) {
                    width = this.mDecorView.getMeasuredWidth();
                }
                if (width == 0) {
                    this.mDecorView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    width = this.mDecorView.getMeasuredWidth();
                }
                this.mWindowParams.x -= width;
            } else if ((absoluteGravity & 5) == 5) {
                layoutParams.x = view.getWidth() + i7;
            }
            if ((absoluteGravity & 48) == 48) {
                int height = this.mDecorView.getHeight();
                if (height == 0) {
                    height = this.mDecorView.getMeasuredHeight();
                }
                if (height == 0) {
                    this.mDecorView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    height = this.mDecorView.getMeasuredHeight();
                }
                this.mWindowParams.y -= height;
            } else if ((absoluteGravity & 80) == 80) {
                WindowManager.LayoutParams layoutParams2 = this.mWindowParams;
                layoutParams2.y = view.getHeight() + layoutParams2.y;
            }
            show();
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᑢ\u0001"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X setText(int i4, CharSequence charSequence) {
        ((TextView) findViewById(i4)).setText(charSequence);
        return this;
    }

    public XToast(Application application) {
        this((Context) application);
        if (Build.VERSION.SDK_INT >= 26) {
            setWindowType(2038);
        } else {
            setWindowType(2003);
        }
    }

    private XToast(Context context) {
        this.mContext = context;
        this.mDecorView = new WindowLayout(context);
        this.mWindowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("ᑠ\u0001"));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mWindowParams = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = android.R.style.Animation.Toast;
        layoutParams.packageName = context.getPackageName();
        this.mWindowParams.flags = 40;
    }
}
