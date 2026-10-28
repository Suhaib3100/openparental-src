package com.lxj.easyadapter;

import android.util.SparseArray;
import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemDelegateManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\t2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b!\u0010\"R\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0011\u0010(\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/lxj/easyadapter/d;", "T", "", "<init>", "()V", "Lcom/lxj/easyadapter/c;", "delegate", "b", "(Lcom/lxj/easyadapter/c;)Lcom/lxj/easyadapter/d;", "", "viewType", "a", "(ILcom/lxj/easyadapter/c;)Lcom/lxj/easyadapter/d;", "k", "itemType", "j", "(I)Lcom/lxj/easyadapter/d;", "item", "position", "i", "(Ljava/lang/Object;I)I", "Lcom/lxj/easyadapter/i;", "holder", "", "payloads", "Lkotlin/k2;", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "f", "(I)Lcom/lxj/easyadapter/c;", "e", "(I)I", "itemViewDelegate", "h", "(Lcom/lxj/easyadapter/c;)I", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "delegates", "g", "()I", "itemViewDelegateCount", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private SparseArray<c<T>> delegates = new SparseArray<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(d dVar, i iVar, Object obj, int i4, List list, int i5, Object obj2) {
        if ((i5 & 8) != 0) {
            list = null;
        }
        dVar.c(iVar, obj, i4, list);
    }

    @l
    public final d<T> a(int viewType, @l c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("\u1774\u0001"));
        if (this.delegates.get(viewType) == null) {
            this.delegates.put(viewType, delegate);
            return this;
        }
        StringBuilder a5 = s.a(ProtectedSandApp.s("\u1775\u0001"), viewType, ProtectedSandApp.s("\u1776\u0001"));
        a5.append(this.delegates.get(viewType));
        throw new IllegalArgumentException(a5.toString());
    }

    @l
    public final d<T> b(@l c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("\u1774\u0001"));
        this.delegates.put(this.delegates.size(), delegate);
        return this;
    }

    public final void c(@l i holder, T item, int position, @m List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("\u1777\u0001"));
        int size = this.delegates.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            c<T> valueAt = this.delegates.valueAt(i4);
            if (valueAt.a(item, position)) {
                List<? extends Object> list = payloads;
                if (list == null || list.isEmpty()) {
                    valueAt.b(holder, item, position);
                    return;
                } else {
                    valueAt.c(holder, item, position, payloads);
                    return;
                }
            }
            i4 = i5;
        }
    }

    public final int e(int viewType) {
        return f(viewType).N();
    }

    @l
    public final c<T> f(int viewType) {
        c<T> cVar = this.delegates.get(viewType);
        l0.m(cVar);
        return cVar;
    }

    public final int g() {
        return this.delegates.size();
    }

    public final int h(@l c<T> itemViewDelegate) {
        l0.p(itemViewDelegate, ProtectedSandApp.s("\u1778\u0001"));
        return this.delegates.indexOfValue(itemViewDelegate);
    }

    public final int i(T item, int position) {
        int size = this.delegates.size() - 1;
        if (size < 0) {
            return 0;
        }
        while (true) {
            int i4 = size - 1;
            if (this.delegates.valueAt(size).a(item, position)) {
                return this.delegates.keyAt(size);
            }
            if (i4 < 0) {
                return 0;
            }
            size = i4;
        }
    }

    @l
    public final d<T> j(int itemType) {
        int indexOfKey = this.delegates.indexOfKey(itemType);
        if (indexOfKey >= 0) {
            this.delegates.removeAt(indexOfKey);
        }
        return this;
    }

    @l
    public final d<T> k(@l c<T> delegate) {
        l0.p(delegate, ProtectedSandApp.s("\u1774\u0001"));
        int indexOfValue = this.delegates.indexOfValue(delegate);
        if (indexOfValue >= 0) {
            this.delegates.removeAt(indexOfValue);
        }
        return this;
    }
}
