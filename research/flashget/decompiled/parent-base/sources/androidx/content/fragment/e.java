package androidx.content.fragment;

import androidx.annotation.d0;
import androidx.content.fragment.d;
import androidx.content.g0;
import androidx.content.h0;
import fg.l;
import kd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
@h0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/navigation/fragment/e;", "Landroidx/navigation/g0;", "Landroidx/navigation/fragment/d$b;", "Landroidx/navigation/fragment/d;", "navigator", "", "id", "Lkotlin/reflect/d;", "Landroidx/fragment/app/e;", "fragmentClass", "<init>", "(Landroidx/navigation/fragment/d;ILkotlin/reflect/d;)V", "", "route", "(Landroidx/navigation/fragment/d;Ljava/lang/String;Lkotlin/reflect/d;)V", "k", "()Landroidx/navigation/fragment/d$b;", "h", "Lkotlin/reflect/d;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends g0<d.b> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private kotlin.reflect.d<? extends androidx.fragment.app.e> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @x0(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public e(@l d navigator, @d0 int i4, @l kotlin.reflect.d<? extends androidx.fragment.app.e> fragmentClass) {
        super(navigator, i4);
        l0.p(navigator, "navigator");
        l0.p(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    @Override // androidx.content.g0
    @l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d.b c() {
        d.b bVar = (d.b) super.c();
        String name = b.e(this.fragmentClass).getName();
        l0.o(name, "fragmentClass.java.name");
        bVar.b0(name);
        return bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l d navigator, @l String route, @l kotlin.reflect.d<? extends androidx.fragment.app.e> fragmentClass) {
        super(navigator, route);
        l0.p(navigator, "navigator");
        l0.p(route, "route");
        l0.p(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }
}
