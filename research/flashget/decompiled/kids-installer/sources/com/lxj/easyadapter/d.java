package com.lxj.easyadapter;

import android.util.SparseArray;
import androidx.core.app.x;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemDelegateManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u0006J\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00062\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u001a\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003R\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/lxj/easyadapter/d;", "T", "", "Lcom/lxj/easyadapter/c;", "delegate", "b", "", "viewType", "a", "k", "itemType", "j", "item", "position", "i", "(Ljava/lang/Object;I)I", "Lcom/lxj/easyadapter/i;", "holder", "", "payloads", "Lkotlin/m2;", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "f", "e", "itemViewDelegate", "h", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "delegates", "g", "()I", "itemViewDelegateCount", "<init>", "()V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private SparseArray<c<T>> delegates = new SparseArray<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(d dVar, i iVar, Object obj, int i5, List list, int i6, Object obj2) {
        if ((i6 & 8) != 0) {
            list = null;
        }
        dVar.c(iVar, obj, i5, list);
    }

    @d5.d
    public final d<T> a(int viewType, @d5.d c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("㓋"));
        if (this.delegates.get(viewType) == null) {
            this.delegates.put(viewType, delegate);
            return this;
        }
        StringBuilder a6 = x.a(ProtectedSandApp.s("㓌"), viewType, ProtectedSandApp.s("㓍"));
        a6.append(this.delegates.get(viewType));
        throw new IllegalArgumentException(a6.toString());
    }

    @d5.d
    public final d<T> b(@d5.d c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("㓎"));
        this.delegates.put(this.delegates.size(), delegate);
        return this;
    }

    public final void c(@d5.d i holder, T item, int position, @d5.e List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("㓏"));
        int size = this.delegates.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            c<T> valueAt = this.delegates.valueAt(i5);
            if (valueAt.b(item, position)) {
                if (payloads == null || payloads.isEmpty()) {
                    valueAt.c(holder, item, position);
                    return;
                } else {
                    valueAt.d(holder, item, position, payloads);
                    return;
                }
            }
            i5 = i6;
        }
    }

    public final int e(int viewType) {
        return f(viewType).a();
    }

    @d5.d
    public final c<T> f(int viewType) {
        c<T> cVar = this.delegates.get(viewType);
        l0.m(cVar);
        return cVar;
    }

    public final int g() {
        return this.delegates.size();
    }

    public final int h(@d5.d c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("㓐"));
        return this.delegates.indexOfValue(itemViewDelegate);
    }

    public final int i(T item, int position) {
        int size = this.delegates.size() - 1;
        if (size < 0) {
            return 0;
        }
        while (true) {
            int i5 = size - 1;
            if (this.delegates.valueAt(size).b(item, position)) {
                return this.delegates.keyAt(size);
            }
            if (i5 < 0) {
                return 0;
            }
            size = i5;
        }
    }

    @d5.d
    public final d<T> j(int itemType) {
        int indexOfKey = this.delegates.indexOfKey(itemType);
        if (indexOfKey >= 0) {
            this.delegates.removeAt(indexOfKey);
        }
        return this;
    }

    @d5.d
    public final d<T> k(@d5.d c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("㓑"));
        int indexOfValue = this.delegates.indexOfValue(delegate);
        if (indexOfValue >= 0) {
            this.delegates.removeAt(indexOfValue);
        }
        return this;
    }
}
