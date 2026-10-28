package com.lxj.easyadapter;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EasyAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/lxj/easyadapter/b;", "T", "Lcom/lxj/easyadapter/g;", "Lcom/lxj/easyadapter/i;", "holder", "t", "", "position", "Lkotlin/m2;", "p0", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "", "payloads", "q0", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "l", "I", "r0", "()I", "s0", "(I)V", "mLayoutId", "data", "<init>", "(Ljava/util/List;I)V", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class b<T> extends g<T> {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int mLayoutId;

    /* compiled from: EasyAdapter.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, d2 = {"com/lxj/easyadapter/b$a", "Lcom/lxj/easyadapter/c;", "item", "", "position", "", "b", "(Ljava/lang/Object;I)Z", "Lcom/lxj/easyadapter/i;", "holder", "t", "Lkotlin/m2;", "c", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;I)V", "", "", "payloads", "d", "(Lcom/lxj/easyadapter/i;Ljava/lang/Object;ILjava/util/List;)V", "a", "easy-adapter_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class a implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<T> f18937a;

        a(b<T> bVar) {
            this.f18937a = bVar;
        }

        @Override // com.lxj.easyadapter.c
        public int a() {
            return this.f18937a.getMLayoutId();
        }

        @Override // com.lxj.easyadapter.c
        public boolean b(T item, int position) {
            return true;
        }

        @Override // com.lxj.easyadapter.c
        public void c(@d5.d i holder, T t5, int position) {
            l0.p(holder, ProtectedSandApp.s("㓅"));
            this.f18937a.p0(holder, t5, position);
        }

        @Override // com.lxj.easyadapter.c
        public void d(@d5.d i holder, T t5, int position, @d5.d List<? extends Object> payloads) {
            l0.p(holder, ProtectedSandApp.s("㓆"));
            l0.p(payloads, ProtectedSandApp.s("㓇"));
            this.f18937a.q0(holder, t5, position, payloads);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@d5.d List<? extends T> list, int i5) {
        super(list);
        l0.p(list, ProtectedSandApp.s("歧"));
        this.mLayoutId = i5;
        Q(new a(this));
    }

    protected abstract void p0(@d5.d i holder, T t5, int position);

    protected void q0(@d5.d i holder, T t5, int position, @d5.d List<? extends Object> payloads) {
        l0.p(holder, ProtectedSandApp.s("歨"));
        l0.p(payloads, ProtectedSandApp.s("歩"));
        p0(holder, t5, position);
    }

    /* renamed from: r0, reason: from getter */
    protected final int getMLayoutId() {
        return this.mLayoutId;
    }

    protected final void s0(int i5) {
        this.mLayoutId = i5;
    }
}
