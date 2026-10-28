package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Arrays;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes7.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: h, reason: collision with root package name */
    @l
    public static final a f77545h = new a();

    /* renamed from: i, reason: collision with root package name */
    @l
    @kd.f
    public static final e f77546i;

    /* renamed from: j, reason: collision with root package name */
    @l
    @kd.f
    public static final e f77547j;

    /* renamed from: k, reason: collision with root package name */
    @l
    @kd.f
    public static final e f77548k;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f77549g;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    static {
        e eVar = new e(1, 9, 0);
        f77546i = eVar;
        f77547j = eVar.m();
        f77548k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l int[] iArr, boolean z4) {
        super(Arrays.copyOf(iArr, iArr.length));
        l0.p(iArr, ProtectedSandApp.s("疐\u0001"));
        this.f77549g = z4;
    }

    private final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(@l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("疑\u0001"));
        if (a() == 2 && b() == 0) {
            e eVar2 = f77546i;
            if (eVar2.a() == 1 && eVar2.b() == 8) {
                return true;
            }
        }
        return i(eVar.k(this.f77549g));
    }

    public final boolean j() {
        return this.f77549g;
    }

    @l
    public final e k(boolean z4) {
        e eVar = z4 ? f77546i : f77547j;
        return eVar.l(this) ? eVar : this;
    }

    @l
    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@l int... iArr) {
        this(iArr, false);
        l0.p(iArr, ProtectedSandApp.s("疏\u0001"));
    }
}
