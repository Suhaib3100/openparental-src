package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: DeserializedArrayValue.kt */
/* loaded from: classes6.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.resolve.constants.b {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final h0 f26244c;

    /* compiled from: DeserializedArrayValue.kt */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.h0, h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ h0 f26245p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0 h0Var) {
            super(1);
            this.f26245p = h0Var;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("蠞"));
            return this.f26245p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@d5.d List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> list, @d5.d h0 h0Var) {
        super(list, new a(h0Var));
        l0.p(list, ProtectedSandApp.s("蠟"));
        l0.p(h0Var, ProtectedSandApp.s("蠠"));
        this.f26244c = h0Var;
    }

    @d5.d
    public final h0 c() {
        return this.f26244c;
    }
}
