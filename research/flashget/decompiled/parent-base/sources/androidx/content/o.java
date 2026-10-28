package androidx.content;

import android.os.Bundle;
import androidx.content.n;
import fg.l;
import fg.m;
import java.lang.reflect.Method;
import java.util.Arrays;
import kd.b;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.d;
import ld.a;

/* compiled from: NavArgsLazy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/navigation/o;", "Landroidx/navigation/n;", "Args", "Lkotlin/b0;", "Lkotlin/reflect/d;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lkotlin/reflect/d;Lld/a;)V", "", "p", "()Z", "b", "Lkotlin/reflect/d;", "c", "Lld/a;", "d", "Landroidx/navigation/n;", "cached", "a", "()Landroidx/navigation/n;", "value", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o<Args extends n> implements b0<Args> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d<Args> navArgsClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final a<Bundle> argumentProducer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Args cached;

    public o(@l d<Args> navArgsClass, @l a<Bundle> argumentProducer) {
        l0.p(navArgsClass, "navArgsClass");
        l0.p(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // kotlin.b0
    @l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.argumentProducer.invoke();
        Method method = p.a().get(this.navArgsClass);
        if (method == null) {
            Class e4 = b.e(this.navArgsClass);
            Class<Bundle>[] b5 = p.b();
            method = e4.getMethod("fromBundle", (Class[]) Arrays.copyOf(b5, b5.length));
            p.a().put(this.navArgsClass, method);
            l0.o(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke2 = method.invoke(null, invoke);
        if (invoke2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        Args args2 = (Args) invoke2;
        this.cached = args2;
        return args2;
    }

    @Override // kotlin.b0
    public boolean p() {
        return this.cached != null;
    }
}
