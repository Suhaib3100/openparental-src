package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ThrowingCaller.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/i;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "<init>", "()V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "c", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final i f75613a = new i();

    private i() {
    }

    @m
    public Void a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public List<Type> c() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @m
    public Object call(@l Object[] args) {
        l0.p(args, ProtectedSandApp.s("朕\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("朖\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public Member d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public Type getReturnType() {
        Class cls = Void.TYPE;
        l0.o(cls, ProtectedSandApp.s("朗\u0001"));
        return cls;
    }
}
