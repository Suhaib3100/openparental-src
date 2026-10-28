package com.lxj.easyadapter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EasyAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0005H$¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/lxj/easyadapter/b;", "T", "Lcom/lxj/easyadapter/g;", "", "data", "", "mLayoutId", "<init>", "(Ljava/util/List;I)V", "Lcom/lxj/easyadapter/i;", "holder", "t", "position", "Lkotlin/k2;", "H", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "payloads", "I", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "j", "J", "()I", "K", "(I)V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class b<T> extends g<T> {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int mLayoutId;

    /* compiled from: EasyAdapter.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/lxj/easyadapter/b$a", "Lcom/lxj/easyadapter/c;", "item", "", "position", "", "a", "(Ljava/lang/Object;I)Z", "Lcom/lxj/easyadapter/i;", "holder", "t", "Lkotlin/k2;", "b", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "", "payloads", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "N", "()I", "easy-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<T> f67072a;

        a(b<T> bVar) {
            this.f67072a = bVar;
        }

        @Override // com.lxj.easyadapter.c
        public int N() {
            return this.f67072a.getMLayoutId();
        }

        @Override // com.lxj.easyadapter.c
        public boolean a(T item, int position) {
            return true;
        }

        @Override // com.lxj.easyadapter.c
        public void b(@l i holder, T t4, int position) {
            l0.p(holder, ProtectedSandApp.s("\u175c\u0001"));
            this.f67072a.H(holder, t4, position);
        }

        @Override // com.lxj.easyadapter.c
        public void c(@l i holder, T t4, int position, @l List<? extends Object> payloads) {
            l0.p(holder, ProtectedSandApp.s("\u175c\u0001"));
            l0.p(payloads, ProtectedSandApp.s("\u175d\u0001"));
            this.f67072a.I(holder, t4, position, payloads);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@l List<? extends T> list, int i4) {
        super(list);
        l0.p(list, ProtectedSandApp.s("ᝮ\u0001"));
        this.mLayoutId = i4;
        k(new a(this));
    }

    protected abstract void H(@l i holder, T t4, int position);

    protected void I(@l i holder, T t4, int position, @l List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("ᝯ\u0001"));
        l0.p(payloads, ProtectedSandApp.s("ᝰ\u0001"));
        H(holder, t4, position);
    }

    /* renamed from: J, reason: from getter */
    protected final int getMLayoutId() {
        return this.mLayoutId;
    }

    protected final void K(int i4) {
        this.mLayoutId = i4;
    }
}
