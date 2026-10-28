package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: ModifierLocalModifierNode.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H \u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H \u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H \u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/modifier/i;", "", "<init>", "()V", "T", "Landroidx/compose/ui/modifier/c;", "key", "value", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/modifier/c;Ljava/lang/Object;)V", "b", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "", "a", "(Landroidx/compose/ui/modifier/c;)Z", "Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/b;", "Landroidx/compose/ui/modifier/o;", "Landroidx/compose/ui/modifier/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19141a = 0;

    public /* synthetic */ i(w wVar) {
        this();
    }

    public abstract boolean a(@fg.l c<?> key);

    @fg.m
    public abstract <T> T b(@fg.l c<T> key);

    public abstract <T> void c(@fg.l c<T> key, T value);

    private i() {
    }
}
