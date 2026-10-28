package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.e1;
import androidx.core.content.f;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.databinding.library.R;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1421d0;
import androidx.view.InterfaceC1423e0;
import androidx.view.LiveData;
import androidx.view.p0;
import com.google.firebase.remoteconfig.p;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ViewDataBinding extends BaseObservable implements k3.b {
    private static final int BINDING_NUMBER_START = 8;
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;

    @c1({c1.a.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private InterfaceC1423e0 mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    public static final String BINDING_TAG_PREFIX = "binding_";
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakPropertyListener(viewDataBinding, i4, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakListListener(viewDataBinding, i4, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new WeakMapListener(viewDataBinding, i4, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new LiveDataListener(viewDataBinding, i4, referenceQueue).getListener();
        }
    };
    private static final CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() { // from class: androidx.databinding.ViewDataBinding.5
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i4, Void r4) {
            if (i4 == 1) {
                if (onRebindCallback.onPreBind(viewDataBinding)) {
                    return;
                }
                viewDataBinding.mRebindHalted = true;
            } else if (i4 == 2) {
                onRebindCallback.onCanceled(viewDataBinding);
            } else {
                if (i4 != 3) {
                    return;
                }
                onRebindCallback.onBound(viewDataBinding);
            }
        }
    };
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    };

    protected static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i4) {
            this.layouts = new String[i4][];
            this.indexes = new int[i4][];
            this.layoutIds = new int[i4][];
        }

        public void setIncludes(int i4, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i4] = strArr;
            this.indexes[i4] = iArr;
            this.layoutIds[i4] = iArr2;
        }
    }

    private static class LiveDataListener implements p0, ObservableReference<LiveData<?>> {

        @q0
        WeakReference<InterfaceC1423e0> mLifecycleOwnerRef = null;
        final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i4, this, referenceQueue);
        }

        @q0
        private InterfaceC1423e0 getLifecycleOwner() {
            WeakReference<InterfaceC1423e0> weakReference = this.mLifecycleOwnerRef;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<LiveData<?>> getListener() {
            return this.mListener;
        }

        @Override // androidx.view.p0
        public void onChanged(@q0 Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                WeakListener<LiveData<?>> weakListener = this.mListener;
                binder.handleFieldChange(weakListener.mLocalFieldId, weakListener.getTarget(), 0);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@q0 InterfaceC1423e0 interfaceC1423e0) {
            InterfaceC1423e0 lifecycleOwner = getLifecycleOwner();
            LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (lifecycleOwner != null) {
                    target.p(this);
                }
                if (interfaceC1423e0 != null) {
                    target.k(interfaceC1423e0, this);
                }
            }
            if (interfaceC1423e0 != null) {
                this.mLifecycleOwnerRef = new WeakReference<>(interfaceC1423e0);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(LiveData<?> liveData) {
            InterfaceC1423e0 lifecycleOwner = getLifecycleOwner();
            if (lifecycleOwner != null) {
                liveData.k(lifecycleOwner, this);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(LiveData<?> liveData) {
            liveData.p(this);
        }
    }

    static class OnStartListener implements InterfaceC1421d0 {
        final WeakReference<ViewDataBinding> mBinding;

        @androidx.view.q0(AbstractC1450w.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference<>(viewDataBinding);
        }
    }

    protected static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        final int mPropertyId;

        public PropertyChangedInverseListener(int i4) {
            this.mPropertyId = i4;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i4) {
            if (i4 == this.mPropertyId || i4 == 0) {
                onChange();
            }
        }
    }

    private static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        final WeakListener<ObservableList> mListener;

        public WeakListListener(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableList> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList target;
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i4, int i5) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i4, int i5) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i4, int i5, int i6) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i4, int i5) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(InterfaceC1423e0 interfaceC1423e0) {
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }
    }

    private static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        final WeakListener<ObservableMap> mListener;

        public WeakMapListener(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableMap> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder == null || observableMap != this.mListener.getTarget()) {
                return;
            }
            binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(InterfaceC1423e0 interfaceC1423e0) {
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }
    }

    private static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        final WeakListener<Observable> mListener;

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<Observable> getListener() {
            return this.mListener;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i4) {
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i4);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(InterfaceC1423e0 interfaceC1423e0) {
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }
    }

    protected ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i4) {
        this.mRebindRunnable = new Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.executePendingBindings();
                } else {
                    ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                }
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i4];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j4) {
                    ViewDataBinding.this.mRebindRunnable.run();
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    protected static ViewDataBinding bind(Object obj, View view, int i4) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i4);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    protected static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String str, int i4, IncludedLayouts includedLayouts, int i5) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i5];
        int length = strArr.length;
        while (i4 < length) {
            if (TextUtils.equals(subSequence, strArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i4) {
        String str = (String) viewGroup.getChildAt(i4).getTag();
        String a5 = f.a(str, 1, 0);
        int length = a5.length();
        int childCount = viewGroup.getChildCount();
        for (int i5 = i4 + 1; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(a5)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i4;
                }
                if (isNumeric(str2, length)) {
                    i4 = i5;
                }
            }
        }
        return i4;
    }

    static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    protected static int getColorFromResource(View view, int i4) {
        return view.getContext().getColor(i4);
    }

    protected static ColorStateList getColorStateListFromResource(View view, int i4) {
        return view.getContext().getColorStateList(i4);
    }

    protected static Drawable getDrawableFromResource(View view, int i4) {
        return view.getContext().getDrawable(i4);
    }

    protected static <K, T> T getFrom(Map<K, T> map, K k4) {
        if (map == null) {
            return null;
        }
        return map.get(k4);
    }

    protected static <T> T getFromArray(T[] tArr, int i4) {
        if (tArr == null || i4 < 0 || i4 >= tArr.length) {
            return null;
        }
        return tArr[i4];
    }

    protected static <T> T getFromList(List<T> list, int i4) {
        if (list == null || i4 < 0 || i4 >= list.size()) {
            return null;
        }
        return list.get(i4);
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected static <T extends ViewDataBinding> T inflateInternal(@o0 LayoutInflater layoutInflater, int i4, @q0 ViewGroup viewGroup, boolean z4, @q0 Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i4, viewGroup, z4, checkAndCastToBindingComponent(obj));
    }

    private static boolean isNumeric(String str, int i4) {
        int length = str.length();
        if (length == i4) {
            return false;
        }
        while (i4 < length) {
            if (!Character.isDigit(str.charAt(i4))) {
                return false;
            }
            i4++;
        }
        return true;
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i4, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    protected static boolean parse(String str, boolean z4) {
        return str == null ? z4 : Boolean.parseBoolean(str);
    }

    private static int parseTagInt(String str, int i4) {
        int i5 = 0;
        while (i4 < str.length()) {
            i5 = (i5 * 10) + (str.charAt(i4) - '0');
            i4++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    protected static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    protected static <T> void setTo(T[] tArr, int i4, T t4) {
        if (tArr == null || i4 < 0 || i4 >= tArr.length) {
            return;
        }
        tArr[i4] = t4;
    }

    public void addOnRebindCallback(@o0 OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    protected void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    void forceExecuteBindings() {
        executeBindings();
    }

    @q0
    public InterfaceC1423e0 getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    protected Object getObservedField(int i4) {
        WeakListener weakListener = this.mLocalFieldObservers[i4];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    @Override // k3.b
    @o0
    public View getRoot() {
        return this.mRoot;
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected void handleFieldChange(int i4, Object obj, int i5) {
        if (this.mInLiveDataRegisterObserver || this.mInStateFlowRegisterObserver || !onFieldChange(i4, obj, i5)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    protected abstract boolean onFieldChange(int i4, Object obj, int i5);

    protected void registerTo(int i4, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return;
        }
        WeakListener weakListener = this.mLocalFieldObservers[i4];
        if (weakListener == null) {
            weakListener = createWeakListener.create(this, i4, sReferenceQueue);
            this.mLocalFieldObservers[i4] = weakListener;
            InterfaceC1423e0 interfaceC1423e0 = this.mLifecycleOwner;
            if (interfaceC1423e0 != null) {
                weakListener.setLifecycleOwner(interfaceC1423e0);
            }
        }
        weakListener.setTarget(obj);
    }

    public void removeOnRebindCallback(@o0 OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    protected void requestRebind() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        InterfaceC1423e0 interfaceC1423e0 = this.mLifecycleOwner;
        if (interfaceC1423e0 == null || interfaceC1423e0.getLifecycle().getState().isAtLeast(AbstractC1450w.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.mPendingRebind) {
                        return;
                    }
                    this.mPendingRebind = true;
                    if (USE_CHOREOGRAPHER) {
                        this.mChoreographer.postFrameCallback(this.mFrameCallback);
                    } else {
                        this.mUIThreadHandler.post(this.mRebindRunnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    @l0
    public void setLifecycleOwner(@q0 InterfaceC1423e0 interfaceC1423e0) {
        boolean z4 = interfaceC1423e0 instanceof Fragment;
        InterfaceC1423e0 interfaceC1423e02 = this.mLifecycleOwner;
        if (interfaceC1423e02 == interfaceC1423e0) {
            return;
        }
        if (interfaceC1423e02 != null) {
            interfaceC1423e02.getLifecycle().d(this.mOnStartListener);
        }
        this.mLifecycleOwner = interfaceC1423e0;
        if (interfaceC1423e0 != null) {
            if (this.mOnStartListener == null) {
                this.mOnStartListener = new OnStartListener();
            }
            interfaceC1423e0.getLifecycle().a(this.mOnStartListener);
        }
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.setLifecycleOwner(interfaceC1423e0);
            }
        }
    }

    protected void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i4, @q0 Object obj);

    public void unbind() {
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    protected boolean unregisterFrom(int i4) {
        WeakListener weakListener = this.mLocalFieldObservers[i4];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    protected boolean updateLiveDataRegistration(int i4, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i4, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected boolean updateRegistration(int i4, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i4);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i4];
        if (weakListener == null) {
            registerTo(i4, obj, createWeakListener);
            return true;
        }
        if (weakListener.getTarget() == obj) {
            return false;
        }
        unregisterFrom(i4);
        registerTo(i4, obj, createWeakListener);
        return true;
    }

    protected static byte parse(String str, byte b5) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b5;
        }
    }

    protected static long safeUnbox(Long l4) {
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    protected void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    protected static boolean getFromArray(boolean[] zArr, int i4) {
        if (zArr == null || i4 < 0 || i4 >= zArr.length) {
            return false;
        }
        return zArr[i4];
    }

    protected static <T> T getFromList(SparseArray<T> sparseArray, int i4) {
        if (sparseArray == null || i4 < 0) {
            return null;
        }
        return sparseArray.get(i4);
    }

    protected static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i4, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    protected static short parse(String str, short s4) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s4;
        }
    }

    protected static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static void setTo(boolean[] zArr, int i4, boolean z4) {
        if (zArr == null || i4 < 0 || i4 >= zArr.length) {
            return;
        }
        zArr[i4] = z4;
    }

    @TargetApi(16)
    protected static <T> T getFromList(LongSparseArray<T> longSparseArray, int i4) {
        if (longSparseArray == null || i4 < 0) {
            return null;
        }
        return longSparseArray.get(i4);
    }

    protected static int parse(String str, int i4) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    protected static byte safeUnbox(Byte b5) {
        if (b5 == null) {
            return (byte) 0;
        }
        return b5.byteValue();
    }

    protected static byte getFromArray(byte[] bArr, int i4) {
        if (bArr == null || i4 < 0 || i4 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i4];
    }

    protected static <T> T getFromList(e1<T> e1Var, int i4) {
        if (e1Var == null || i4 < 0) {
            return null;
        }
        return e1Var.i(i4);
    }

    protected static long parse(String str, long j4) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    protected static char safeUnbox(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    protected static void setTo(byte[] bArr, int i4, byte b5) {
        if (bArr == null || i4 < 0 || i4 >= bArr.length) {
            return;
        }
        bArr[i4] = b5;
    }

    protected static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i4) {
        if (sparseBooleanArray == null || i4 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void mapBindings(androidx.databinding.DataBindingComponent r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.IncludedLayouts r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    protected static float parse(String str, float f4) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f4;
        }
    }

    protected static double safeUnbox(Double d5) {
        return d5 == null ? p.f60679p : d5.doubleValue();
    }

    protected static short getFromArray(short[] sArr, int i4) {
        if (sArr == null || i4 < 0 || i4 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i4];
    }

    protected static int getFromList(SparseIntArray sparseIntArray, int i4) {
        if (sparseIntArray == null || i4 < 0) {
            return 0;
        }
        return sparseIntArray.get(i4);
    }

    protected static double parse(String str, double d5) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d5;
        }
    }

    protected static float safeUnbox(Float f4) {
        if (f4 == null) {
            return 0.0f;
        }
        return f4.floatValue();
    }

    protected static void setTo(short[] sArr, int i4, short s4) {
        if (sArr == null || i4 < 0 || i4 >= sArr.length) {
            return;
        }
        sArr[i4] = s4;
    }

    protected boolean updateRegistration(int i4, Observable observable) {
        return updateRegistration(i4, observable, CREATE_PROPERTY_LISTENER);
    }

    @TargetApi(18)
    protected static long getFromList(SparseLongArray sparseLongArray, int i4) {
        if (sparseLongArray == null || i4 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i4);
    }

    protected static char parse(String str, char c5) {
        return (str == null || str.isEmpty()) ? c5 : str.charAt(0);
    }

    protected static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected boolean updateRegistration(int i4, ObservableList observableList) {
        return updateRegistration(i4, observableList, CREATE_LIST_LISTENER);
    }

    protected static char getFromArray(char[] cArr, int i4) {
        if (cArr == null || i4 < 0 || i4 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i4];
    }

    protected static void setTo(char[] cArr, int i4, char c5) {
        if (cArr == null || i4 < 0 || i4 >= cArr.length) {
            return;
        }
        cArr[i4] = c5;
    }

    protected boolean updateRegistration(int i4, ObservableMap observableMap) {
        return updateRegistration(i4, observableMap, CREATE_MAP_LISTENER);
    }

    protected static int getFromArray(int[] iArr, int i4) {
        if (iArr == null || i4 < 0 || i4 >= iArr.length) {
            return 0;
        }
        return iArr[i4];
    }

    protected static void setTo(int[] iArr, int i4, int i5) {
        if (iArr == null || i4 < 0 || i4 >= iArr.length) {
            return;
        }
        iArr[i4] = i5;
    }

    protected static long getFromArray(long[] jArr, int i4) {
        if (jArr == null || i4 < 0 || i4 >= jArr.length) {
            return 0L;
        }
        return jArr[i4];
    }

    protected static void setTo(long[] jArr, int i4, long j4) {
        if (jArr == null || i4 < 0 || i4 >= jArr.length) {
            return;
        }
        jArr[i4] = j4;
    }

    protected ViewDataBinding(Object obj, View view, int i4) {
        this(checkAndCastToBindingComponent(obj), view, i4);
    }

    protected static float getFromArray(float[] fArr, int i4) {
        if (fArr == null || i4 < 0 || i4 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i4];
    }

    protected static void setTo(float[] fArr, int i4, float f4) {
        if (fArr == null || i4 < 0 || i4 >= fArr.length) {
            return;
        }
        fArr[i4] = f4;
    }

    protected static double getFromArray(double[] dArr, int i4) {
        return (dArr == null || i4 < 0 || i4 >= dArr.length) ? p.f60679p : dArr[i4];
    }

    protected static void setTo(double[] dArr, int i4, double d5) {
        if (dArr == null || i4 < 0 || i4 >= dArr.length) {
            return;
        }
        dArr[i4] = d5;
    }

    protected static <T> void setTo(List<T> list, int i4, T t4) {
        if (list == null || i4 < 0 || i4 >= list.size()) {
            return;
        }
        list.set(i4, t4);
    }

    protected static <T> void setTo(SparseArray<T> sparseArray, int i4, T t4) {
        if (sparseArray == null || i4 < 0 || i4 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i4, t4);
    }

    @TargetApi(16)
    protected static <T> void setTo(LongSparseArray<T> longSparseArray, int i4, T t4) {
        if (longSparseArray == null || i4 < 0 || i4 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i4, t4);
    }

    protected static <T> void setTo(e1<T> e1Var, int i4, T t4) {
        if (e1Var == null || i4 < 0 || i4 >= e1Var.z()) {
            return;
        }
        e1Var.p(i4, t4);
    }

    protected static void setTo(SparseBooleanArray sparseBooleanArray, int i4, boolean z4) {
        if (sparseBooleanArray == null || i4 < 0 || i4 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i4, z4);
    }

    protected static void setTo(SparseIntArray sparseIntArray, int i4, int i5) {
        if (sparseIntArray == null || i4 < 0 || i4 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i4, i5);
    }

    @TargetApi(18)
    protected static void setTo(SparseLongArray sparseLongArray, int i4, long j4) {
        if (sparseLongArray == null || i4 < 0 || i4 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i4, j4);
    }

    protected static <K, T> void setTo(Map<K, T> map, K k4, T t4) {
        if (map == null) {
            return;
        }
        map.put(k4, t4);
    }
}
