package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.sequences.m;
import v0.h;

/* compiled from: CollectionPreviewParameterProvider.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/a;", "T", "Lv0/h;", "", "collection", "<init>", "(Ljava/util/Collection;)V", "a", "Ljava/util/Collection;", "Lkotlin/sequences/m;", "K", "()Lkotlin/sequences/m;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class a<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21447b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // v0.h
    @l
    public m<T> K() {
        return w.A1(this.collection);
    }
}
