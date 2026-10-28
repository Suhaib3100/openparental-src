package androidx.content;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.c1;
import fg.l;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: NavType.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001e\u001f !\"#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016¨\u0006$"}, d2 = {"Landroidx/navigation/x0;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "i", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "g", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "a", "Z", "f", "()Z", "Ljava/lang/String;", "c", "name", "l", "m", "n", "o", "p", "q", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class x0<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<Integer> f31374d = new f(false);

    /* renamed from: e, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<Integer> f31375e = new i(false);

    /* renamed from: f, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<int[]> f31376f = new e(true);

    /* renamed from: g, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<Long> f31377g = new h(false);

    /* renamed from: h, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<long[]> f31378h = new g(true);

    /* renamed from: i, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<Float> f31379i = new d(false);

    /* renamed from: j, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<float[]> f31380j = new c(true);

    /* renamed from: k, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<Boolean> f31381k = new b(false);

    /* renamed from: l, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<boolean[]> f31382l = new a(true);

    /* renamed from: m, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<String> f31383m = new k(true);

    /* renamed from: n, reason: collision with root package name */
    @l
    @kd.f
    public static final x0<String[]> f31384n = new j(true);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullableAllowed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String name = "nav_type";

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$a", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "k", "(Ljava/lang/String;)[Z", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends x0<boolean[]> {
        a() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m boolean[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putBooleanArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$b", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "k", "(Ljava/lang/String;)Ljava/lang/Boolean;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b extends x0<Boolean> {
        b() {
            super(false);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "boolean";
        }

        @Override // androidx.content.x0
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Boolean bool) {
            l(bundle, str, bool.booleanValue());
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(@l String value) {
            boolean z4;
            l0.p(value, "value");
            if (l0.g(value, "true")) {
                z4 = true;
            } else {
                if (!l0.g(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        public void l(@l Bundle bundle, @l String key, boolean value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putBoolean(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$c", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "k", "(Ljava/lang/String;)[F", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c extends x0<float[]> {
        c() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "float[]";
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m float[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putFloatArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$d", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "k", "(Ljava/lang/String;)Ljava/lang/Float;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d extends x0<Float> {
        d() {
            super(false);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "float";
        }

        @Override // androidx.content.x0
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Float f4) {
            l(bundle, str, f4.floatValue());
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Float) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(@l String value) {
            l0.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void l(@l Bundle bundle, @l String key, float value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putFloat(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$e", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "k", "(Ljava/lang/String;)[I", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class e extends x0<int[]> {
        e() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m int[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putIntArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$f", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "k", "(Ljava/lang/String;)Ljava/lang/Integer;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class f extends x0<Integer> {
        f() {
            super(false);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "integer";
        }

        @Override // androidx.content.x0
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Integer num) {
            l(bundle, str, num.intValue());
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(@l String value) {
            int parseInt;
            l0.p(value, "value");
            if (v.s2(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, kotlin.text.c.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void l(@l Bundle bundle, @l String key, int value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putInt(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$g", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "k", "(Ljava/lang/String;)[J", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class g extends x0<long[]> {
        g() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "long[]";
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m long[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putLongArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$h", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "k", "(Ljava/lang/String;)Ljava/lang/Long;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class h extends x0<Long> {
        h() {
            super(false);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "long";
        }

        @Override // androidx.content.x0
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Long l4) {
            l(bundle, str, l4.longValue());
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Long) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(@l String value) {
            String str;
            long parseLong;
            l0.p(value, "value");
            if (v.J1(value, "L", false, 2, null)) {
                str = value.substring(0, value.length() - 1);
                l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            if (v.s2(value, "0x", false, 2, null)) {
                String substring = str.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseLong = Long.parseLong(substring, kotlin.text.c.a(16));
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void l(@l Bundle bundle, @l String key, long value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putLong(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$i", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "k", "(Ljava/lang/String;)Ljava/lang/Integer;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class i extends x0<Integer> {
        i() {
            super(false);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "reference";
        }

        @Override // androidx.content.x0
        public /* bridge */ /* synthetic */ void i(Bundle bundle, String str, Integer num) {
            l(bundle, str, num.intValue());
        }

        @Override // androidx.content.x0
        @l
        @androidx.annotation.c
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            if (obj != null) {
                return (Integer) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(@l String value) {
            int parseInt;
            l0.p(value, "value");
            if (v.s2(value, "0x", false, 2, null)) {
                String substring = value.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, kotlin.text.c.a(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void l(@l Bundle bundle, @l String key, @androidx.annotation.c int value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putInt(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/navigation/x0$j", "Landroidx/navigation/x0;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "k", "(Ljava/lang/String;)[Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class j extends x0<String[]> {
        j() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "string[]";
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m String[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putStringArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/navigation/x0$k", "Landroidx/navigation/x0;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "k", "(Ljava/lang/String;)Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class k extends x0<String> {
        k() {
            super(true);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            return "string";
        }

        @Override // androidx.content.x0
        /* renamed from: h */
        public String k(String value) {
            l0.p(value, "value");
            return value;
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (String) bundle.get(key);
        }

        @l
        public String k(@l String value) {
            l0.p(value, "value");
            return value;
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m String value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putString(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0011R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Landroidx/navigation/x0$l;", "", "<init>", "()V", "", "type", "packageName", "Landroidx/navigation/x0;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/x0;", "value", "b", "(Ljava/lang/String;)Landroidx/navigation/x0;", "c", "(Ljava/lang/Object;)Landroidx/navigation/x0;", "", "BoolArrayType", "Landroidx/navigation/x0;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "ReferenceType", "", "StringArrayType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.x0$l, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @kd.n
        public x0<?> a(@fg.m String type, @fg.m String packageName) {
            x0<Integer> x0Var = x0.f31374d;
            if (l0.g(x0Var.getName(), type)) {
                return x0Var;
            }
            x0 x0Var2 = x0.f31376f;
            if (l0.g(x0Var2.getName(), type)) {
                return x0Var2;
            }
            x0<Long> x0Var3 = x0.f31377g;
            if (l0.g(x0Var3.getName(), type)) {
                return x0Var3;
            }
            x0 x0Var4 = x0.f31378h;
            if (l0.g(x0Var4.getName(), type)) {
                return x0Var4;
            }
            x0<Boolean> x0Var5 = x0.f31381k;
            if (l0.g(x0Var5.getName(), type)) {
                return x0Var5;
            }
            x0 x0Var6 = x0.f31382l;
            if (l0.g(x0Var6.getName(), type)) {
                return x0Var6;
            }
            x0<String> x0Var7 = x0.f31383m;
            if (l0.g(x0Var7.getName(), type)) {
                return x0Var7;
            }
            x0 x0Var8 = x0.f31384n;
            if (l0.g(x0Var8.getName(), type)) {
                return x0Var8;
            }
            x0<Float> x0Var9 = x0.f31379i;
            if (l0.g(x0Var9.getName(), type)) {
                return x0Var9;
            }
            x0 x0Var10 = x0.f31380j;
            if (l0.g(x0Var10.getName(), type)) {
                return x0Var10;
            }
            x0<Integer> x0Var11 = x0.f31375e;
            if (l0.g(x0Var11.getName(), type)) {
                return x0Var11;
            }
            if (type == null || type.length() == 0) {
                return x0Var7;
            }
            try {
                String C = (!v.s2(type, ".", false, 2, null) || packageName == null) ? type : l0.C(packageName, type);
                if (v.J1(type, "[]", false, 2, null)) {
                    C = C.substring(0, C.length() - 2);
                    l0.o(C, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(C);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        return new n(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        return new p(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(C);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        return new o(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        return new m(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        return new q(cls2);
                    }
                }
                throw new IllegalArgumentException(l0.C(C, " is not Serializable or Parcelable."));
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        @l
        @kd.n
        @c1({c1.a.LIBRARY_GROUP})
        public final x0<Object> b(@l String value) {
            l0.p(value, "value");
            try {
                try {
                    try {
                        try {
                            x0<Integer> x0Var = x0.f31374d;
                            x0Var.k(value);
                            return x0Var;
                        } catch (IllegalArgumentException unused) {
                            x0<Float> x0Var2 = x0.f31379i;
                            x0Var2.k(value);
                            return x0Var2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        x0<Long> x0Var3 = x0.f31377g;
                        x0Var3.k(value);
                        return x0Var3;
                    }
                } catch (IllegalArgumentException unused3) {
                    return x0.f31383m;
                }
            } catch (IllegalArgumentException unused4) {
                x0<Boolean> x0Var4 = x0.f31381k;
                x0Var4.k(value);
                return x0Var4;
            }
        }

        @l
        @kd.n
        @c1({c1.a.LIBRARY_GROUP})
        public final x0<Object> c(@fg.m Object value) {
            x0<Object> qVar;
            if (value instanceof Integer) {
                return x0.f31374d;
            }
            if (value instanceof int[]) {
                return x0.f31376f;
            }
            if (value instanceof Long) {
                return x0.f31377g;
            }
            if (value instanceof long[]) {
                return x0.f31378h;
            }
            if (value instanceof Float) {
                return x0.f31379i;
            }
            if (value instanceof float[]) {
                return x0.f31380j;
            }
            if (value instanceof Boolean) {
                return x0.f31381k;
            }
            if (value instanceof boolean[]) {
                return x0.f31382l;
            }
            if ((value instanceof String) || value == null) {
                return x0.f31383m;
            }
            if ((value instanceof Object[]) && (((Object[]) value) instanceof String[])) {
                return x0.f31384n;
            }
            if (value.getClass().isArray()) {
                Class<?> componentType = value.getClass().getComponentType();
                l0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = value.getClass().getComponentType();
                    if (componentType2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                    qVar = new n<>(componentType2);
                    return qVar;
                }
            }
            if (value.getClass().isArray()) {
                Class<?> componentType3 = value.getClass().getComponentType();
                l0.m(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = value.getClass().getComponentType();
                    if (componentType4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                    qVar = new p<>(componentType4);
                    return qVar;
                }
            }
            if (value instanceof Parcelable) {
                qVar = new o<>(value.getClass());
            } else if (value instanceof Enum) {
                qVar = new m<>(value.getClass());
            } else {
                if (!(value instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + ((Object) value.getClass().getName()) + " is not supported for navigation arguments.");
                }
                qVar = new q<>(value.getClass());
            }
            return qVar;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/x0$m;", "", "D", "Landroidx/navigation/x0$q;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "m", "(Ljava/lang/String;)Ljava/lang/Enum;", "p", "Ljava/lang/Class;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class m<D extends Enum<?>> extends q<D> {

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@l Class<D> type) {
            super(false, type);
            l0.p(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.x0.q, androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.x0.q
        @l
        /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D k(@l String value) {
            D d5;
            l0.p(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            l0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    d5 = null;
                    break;
                }
                d5 = enumConstants[i4];
                i4++;
                if (v.K1(d5.name(), value, true)) {
                    break;
                }
            }
            D d6 = d5;
            if (d6 != null) {
                return d6;
            }
            StringBuilder a5 = androidx.appcompat.view.g.a("Enum value ", value, " not found for type ");
            a5.append((Object) this.type.getName());
            a5.append('.');
            throw new IllegalArgumentException(a5.toString());
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/navigation/x0$n;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/x0;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "k", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "o", "Ljava/lang/Class;", "arrayType", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class n<D extends Parcelable> extends x0<D[]> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @l
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            String name = this.arrayType.getName();
            l0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !l0.g(n.class, other.getClass())) {
                return false;
            }
            return l0.g(this.arrayType, ((n) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.content.x0
        @l
        public D[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m D[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/navigation/x0$o;", "D", "Landroidx/navigation/x0;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "i", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "h", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "o", "Ljava/lang/Class;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class o<D> extends x0<D> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.content.x0
        @fg.m
        public D b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !l0.g(o.class, other.getClass())) {
                return false;
            }
            return l0.g(this.type, ((o) other).type);
        }

        @Override // androidx.content.x0
        /* renamed from: h */
        public D k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.content.x0
        public void i(@l Bundle bundle, @l String key, D value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/navigation/x0$p;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/x0;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "k", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "o", "Ljava/lang/Class;", "arrayType", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class p<D extends Serializable> extends x0<D[]> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @l
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + ((Object) type.getName()) + ';');
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            String name = this.arrayType.getName();
            l0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !l0.g(p.class, other.getClass())) {
                return false;
            }
            return l0.g(this.arrayType, ((p) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D[] b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.content.x0
        @l
        public D[] k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @fg.m D[] value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }
    }

    public x0(boolean z4) {
        this.isNullableAllowed = z4;
    }

    @l
    @kd.n
    public static x0<?> a(@fg.m String str, @fg.m String str2) {
        return INSTANCE.a(str, str2);
    }

    @l
    @kd.n
    @c1({c1.a.LIBRARY_GROUP})
    public static final x0<Object> d(@l String str) {
        return INSTANCE.b(str);
    }

    @l
    @kd.n
    @c1({c1.a.LIBRARY_GROUP})
    public static final x0<Object> e(@fg.m Object obj) {
        return INSTANCE.c(obj);
    }

    @fg.m
    public abstract T b(@l Bundle bundle, @l String key);

    @l
    /* renamed from: c, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* renamed from: f, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final T g(@l Bundle bundle, @l String key, @l String value) {
        l0.p(bundle, "bundle");
        l0.p(key, "key");
        l0.p(value, "value");
        T k4 = k(value);
        i(bundle, key, k4);
        return k4;
    }

    /* renamed from: h */
    public abstract T k(@l String value);

    public abstract void i(@l Bundle bundle, @l String key, T value);

    @l
    public String toString() {
        return getName();
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/navigation/x0$q;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/x0;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Lkotlin/k2;", "l", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "k", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "o", "Ljava/lang/Class;", "c", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class q<D extends Serializable> extends x0<D> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.content.x0
        @l
        /* renamed from: c */
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof q) {
                return l0.g(this.type, ((q) other).type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.content.x0
        @fg.m
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D b(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.content.x0
        @l
        public D k(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.content.x0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(@l Bundle bundle, @l String key, @l D value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            l0.p(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z4, @l Class<D> type) {
            super(z4);
            l0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
