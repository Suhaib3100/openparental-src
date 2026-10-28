package androidx.content.fragment;

import android.os.Bundle;
import androidx.annotation.l0;
import androidx.content.n;
import androidx.content.o;
import androidx.fragment.app.Fragment;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;

/* compiled from: FragmentNavArgsLazy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/n;", "Args", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/o;", "a", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/o;", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: FragmentNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/n;", "Args", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements ld.a<Bundle> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f31102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31102b = fragment;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f31102b.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f31102b + " has null arguments");
        }
    }

    @l0
    public static final <Args extends n> o<Args> a(Fragment fragment) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.P();
        return new o<>(l1.d(n.class), new a(fragment));
    }
}
