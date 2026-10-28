package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public final class w extends b {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h0 f77897c;

    /* compiled from: constantValues.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.h0, h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f77898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0 h0Var) {
            super(1);
            this.f77898b = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("磧\u0001"));
            return this.f77898b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@fg.l List<? extends g<?>> list, @fg.l h0 h0Var) {
        super(list, new a(h0Var));
        l0.p(list, ProtectedSandApp.s("磨\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("磩\u0001"));
        this.f77897c = h0Var;
    }

    @fg.l
    public final h0 c() {
        return this.f77897c;
    }
}
