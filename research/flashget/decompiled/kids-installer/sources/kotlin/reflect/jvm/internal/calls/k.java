package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: ThrowingCaller.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/k;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "i", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final k f23863a = new k();

    private k() {
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.e
    public Object C(@d5.d Object[] args) {
        l0.p(args, ProtectedSandApp.s("䎷"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("䎸"));
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public List<Type> a() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public Member b() {
        return null;
    }

    @d5.e
    public Void c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public Type i() {
        Class cls = Void.TYPE;
        l0.o(cls, ProtectedSandApp.s("䎹"));
        return cls;
    }
}
