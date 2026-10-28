package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* loaded from: classes3.dex */
public class DataBindingUtil {
    private static DataBinderMapper sMapper = new DataBinderMapperImpl();
    private static DataBindingComponent sDefaultComponent = null;

    private DataBindingUtil() {
    }

    @q0
    public static <T extends ViewDataBinding> T bind(@o0 View view) {
        return (T) bind(view, sDefaultComponent);
    }

    private static <T extends ViewDataBinding> T bindToAddedViews(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i4, int i5) {
        int childCount = viewGroup.getChildCount();
        int i6 = childCount - i4;
        if (i6 == 1) {
            return (T) bind(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i5);
        }
        View[] viewArr = new View[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            viewArr[i7] = viewGroup.getChildAt(i7 + i4);
        }
        return (T) bind(dataBindingComponent, viewArr, i5);
    }

    @q0
    public static String convertBrIdToString(int i4) {
        return sMapper.convertBrIdToString(i4);
    }

    @q0
    public static <T extends ViewDataBinding> T findBinding(@o0 View view) {
        while (view != null) {
            T t4 = (T) ViewDataBinding.getBinding(view);
            if (t4 != null) {
                return t4;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char charAt = str.charAt(6);
                    int indexOf = str.indexOf(47, 7);
                    if (charAt == '/') {
                        if (indexOf == -1) {
                            return null;
                        }
                    } else if (charAt == '-' && indexOf != -1 && str.indexOf(47, indexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @q0
    public static <T extends ViewDataBinding> T getBinding(@o0 View view) {
        return (T) ViewDataBinding.getBinding(view);
    }

    @q0
    public static DataBindingComponent getDefaultComponent() {
        return sDefaultComponent;
    }

    public static <T extends ViewDataBinding> T inflate(@o0 LayoutInflater layoutInflater, int i4, @q0 ViewGroup viewGroup, boolean z4) {
        return (T) inflate(layoutInflater, i4, viewGroup, z4, sDefaultComponent);
    }

    public static <T extends ViewDataBinding> T setContentView(@o0 Activity activity, int i4) {
        return (T) setContentView(activity, i4, sDefaultComponent);
    }

    public static void setDefaultComponent(@q0 DataBindingComponent dataBindingComponent) {
        sDefaultComponent = dataBindingComponent;
    }

    @q0
    public static <T extends ViewDataBinding> T bind(@o0 View view, DataBindingComponent dataBindingComponent) {
        T t4 = (T) getBinding(view);
        if (t4 != null) {
            return t4;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = sMapper.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) sMapper.getDataBinder(dataBindingComponent, view, layoutId);
        }
        throw new IllegalArgumentException(a.a("View is not a binding layout. Tag: ", tag));
    }

    public static <T extends ViewDataBinding> T inflate(@o0 LayoutInflater layoutInflater, int i4, @q0 ViewGroup viewGroup, boolean z4, @q0 DataBindingComponent dataBindingComponent) {
        boolean z5 = viewGroup != null && z4;
        return z5 ? (T) bindToAddedViews(dataBindingComponent, viewGroup, z5 ? viewGroup.getChildCount() : 0, i4) : (T) bind(dataBindingComponent, layoutInflater.inflate(i4, viewGroup, z4), i4);
    }

    public static <T extends ViewDataBinding> T setContentView(@o0 Activity activity, int i4, @q0 DataBindingComponent dataBindingComponent) {
        activity.setContentView(i4);
        return (T) bindToAddedViews(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i4);
    }

    static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        return (T) sMapper.getDataBinder(dataBindingComponent, viewArr, i4);
    }

    static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View view, int i4) {
        return (T) sMapper.getDataBinder(dataBindingComponent, view, i4);
    }
}
