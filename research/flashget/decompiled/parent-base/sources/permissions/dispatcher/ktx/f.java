package permissions.dispatcher.ktx;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;

/* compiled from: LocationPermission.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lpermissions/dispatcher/ktx/e;", "", "sdkVer", "", "a", "([Lpermissions/dispatcher/ktx/e;I)[Ljava/lang/String;", "ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class f {

    /* compiled from: LocationPermission.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpermissions/dispatcher/ktx/e;", "it", "", "<anonymous>", "(Lpermissions/dispatcher/ktx/e;)Z"}, k = 3, mv = {1, 5, 1})
    static final class a extends n0 implements ld.l<e, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4) {
            super(1);
            this.f88775b = i4;
        }

        public final boolean a(@fg.l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꕙ\u0001"));
            return eVar.getApiLevel() <= this.f88775b;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(e eVar) {
            return Boolean.valueOf(a(eVar));
        }
    }

    /* compiled from: LocationPermission.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpermissions/dispatcher/ktx/e;", "it", "", "<anonymous>", "(Lpermissions/dispatcher/ktx/e;)Ljava/lang/String;"}, k = 3, mv = {1, 5, 1})
    static final class b extends n0 implements ld.l<e, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f88776b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꕚ\u0001"));
            return eVar.getPermission();
        }
    }

    @fg.l
    public static final String[] a(@fg.l e[] eVarArr, int i4) {
        l0.p(eVarArr, ProtectedSandApp.s("ꕛ\u0001"));
        Object[] array = p.c3(p.k1(p.p0(kotlin.collections.l.K5(eVarArr), new a(i4)), b.f88776b)).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException(ProtectedSandApp.s("ꕜ\u0001"));
    }

    public static /* synthetic */ String[] b(e[] eVarArr, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Build.VERSION.SDK_INT;
        }
        return a(eVarArr, i4);
    }
}
