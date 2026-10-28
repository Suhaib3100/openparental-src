package androidx.compose.ui.modifier;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: ModifierLocal.kt */
@x4
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/modifier/c;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lld/a;)V", "a", "Lld/a;", "()Lld/a;", "Landroidx/compose/ui/modifier/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f19129b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<T> defaultFactory;

    public /* synthetic */ c(ld.a aVar, w wVar) {
        this(aVar);
    }

    @fg.l
    public final ld.a<T> a() {
        return this.defaultFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(ld.a<? extends T> aVar) {
        this.defaultFactory = aVar;
    }
}
