package androidx.window.sidecar;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.m1;
import androidx.window.core.b;
import androidx.window.core.g;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.q;
import androidx.window.sidecar.r;
import fg.l;
import fg.m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: SidecarAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Landroidx/window/layout/t;", "", "Landroidx/window/core/g$b;", "verificationMode", "<init>", "(Landroidx/window/core/g$b;)V", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", "second", "", "c", "(Ljava/util/List;Ljava/util/List;)Z", "b", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Landroidx/window/layout/l;", "f", "(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/b0;", "e", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/b0;", "a", "(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z", "d", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z", "feature", "g", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/l;", "Landroidx/window/core/g$b;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.b verificationMode;

    /* renamed from: c, reason: collision with root package name */
    private static final String f35849c = "t";

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/t$a;", "", "<init>", "()V", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "c", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;", "displayFeatures", "Lkotlin/k2;", "e", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Ljava/util/List;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "b", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "a", "posture", "d", "(Landroidx/window/sidecar/SidecarDeviceState;I)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.layout.t$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        @m1
        public final int a(@l SidecarDeviceState sidecarDeviceState) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(@l SidecarDeviceState sidecarDeviceState) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            int a5 = a(sidecarDeviceState);
            if (a5 < 0 || a5 > 4) {
                return 0;
            }
            return a5;
        }

        @l
        @SuppressLint({"BanUncheckedReflection"})
        @m1
        public final List<androidx.window.sidecar.SidecarDisplayFeature> c(@l SidecarWindowLayoutInfo info) {
            l0.p(info, "info");
            try {
                try {
                    List<androidx.window.sidecar.SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? w.H() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return w.H();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @m1
        public final void d(@l SidecarDeviceState sidecarDeviceState, int posture) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = posture;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(posture));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @m1
        public final void e(@l SidecarWindowLayoutInfo info, @l List<androidx.window.sidecar.SidecarDisplayFeature> displayFeatures) {
            l0.p(info, "info");
            l0.p(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.window.layout.t$b, reason: from Kotlin metadata */
    static final class SidecarDisplayFeature extends n0 implements ld.l<androidx.window.sidecar.SidecarDisplayFeature, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final SidecarDisplayFeature f35851b = new SidecarDisplayFeature(1);

        SidecarDisplayFeature() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l androidx.window.sidecar.SidecarDisplayFeature require) {
            l0.p(require, "$this$require");
            boolean z4 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.window.layout.t$c, reason: from Kotlin metadata and case insensitive filesystem */
    static final class C1464c extends n0 implements ld.l<androidx.window.sidecar.SidecarDisplayFeature, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1464c f35852b = new C1464c(1);

        C1464c() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l androidx.window.sidecar.SidecarDisplayFeature require) {
            l0.p(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.window.layout.t$d, reason: from Kotlin metadata and case insensitive filesystem */
    static final class C1465d extends n0 implements ld.l<androidx.window.sidecar.SidecarDisplayFeature, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1465d f35853b = new C1465d(1);

        C1465d() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l androidx.window.sidecar.SidecarDisplayFeature require) {
            l0.p(require, "$this$require");
            boolean z4 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.window.layout.t$e, reason: from Kotlin metadata and case insensitive filesystem */
    static final class C1466e extends n0 implements ld.l<androidx.window.sidecar.SidecarDisplayFeature, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1466e f35854b = new C1466e(1);

        C1466e() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l androidx.window.sidecar.SidecarDisplayFeature require) {
            l0.p(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(androidx.window.sidecar.SidecarDisplayFeature first, androidx.window.sidecar.SidecarDisplayFeature second) {
        if (l0.g(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return l0.g(first.getRect(), second.getRect());
    }

    private final boolean c(List<androidx.window.sidecar.SidecarDisplayFeature> first, List<androidx.window.sidecar.SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (!b(first.get(i4), second.get(i4))) {
                return false;
            }
            i4 = i5;
        }
        return true;
    }

    public final boolean a(@m SidecarDeviceState first, @m SidecarDeviceState second) {
        if (l0.g(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return companion.b(first) == companion.b(second);
    }

    public final boolean d(@m SidecarWindowLayoutInfo first, @m SidecarWindowLayoutInfo second) {
        if (l0.g(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return c(companion.c(first), companion.c(second));
    }

    @l
    public final b0 e(@m SidecarWindowLayoutInfo extensionInfo, @l SidecarDeviceState state) {
        l0.p(state, "state");
        if (extensionInfo == null) {
            return new b0(w.H());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = INSTANCE;
        companion.d(sidecarDeviceState, companion.b(state));
        return new b0(f(companion.c(extensionInfo), sidecarDeviceState));
    }

    @l
    public final List<l> f(@l List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures, @l SidecarDeviceState deviceState) {
        l0.p(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        l0.p(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            l g4 = g((androidx.window.sidecar.SidecarDisplayFeature) it.next(), deviceState);
            if (g4 != null) {
                arrayList.add(g4);
            }
        }
        return arrayList;
    }

    @m
    public final l g(@l androidx.window.sidecar.SidecarDisplayFeature feature, @l SidecarDeviceState deviceState) {
        r.b a5;
        q.c cVar;
        l0.p(feature, "feature");
        l0.p(deviceState, "deviceState");
        g.Companion companion = g.INSTANCE;
        String TAG = f35849c;
        l0.o(TAG, "TAG");
        androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) g.Companion.b(companion, feature, TAG, this.verificationMode, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", SidecarDisplayFeature.f35851b).c("Feature bounds must not be 0", C1464c.f35852b).c("TYPE_FOLD must have 0 area", C1465d.f35853b).c("Feature be pinned to either left or top", C1466e.f35854b).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            a5 = r.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            a5 = r.b.INSTANCE.b();
        }
        int b5 = INSTANCE.b(deviceState);
        if (b5 == 0 || b5 == 1) {
            return null;
        }
        if (b5 == 2) {
            cVar = q.c.f35831d;
        } else if (b5 == 3) {
            cVar = q.c.f35830c;
        } else {
            if (b5 == 4) {
                return null;
            }
            cVar = q.c.f35830c;
        }
        Rect rect = feature.getRect();
        l0.o(rect, "feature.rect");
        return new r(new b(rect), a5, cVar);
    }

    public t(@l g.b verificationMode) {
        l0.p(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ t(g.b bVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? g.b.QUIET : bVar);
    }
}
