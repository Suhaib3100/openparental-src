package com.scwang.smart.refresh.layout.simple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import qc.d;
import qc.e;
import qc.f;

/* compiled from: SimpleComponent.java */
/* loaded from: classes6.dex */
public abstract class b extends RelativeLayout implements qc.a {

    /* renamed from: b, reason: collision with root package name */
    protected View f70697b;

    /* renamed from: c, reason: collision with root package name */
    protected com.scwang.smart.refresh.layout.constant.c f70698c;

    /* renamed from: d, reason: collision with root package name */
    protected qc.a f70699d;

    /* JADX WARN: Multi-variable type inference failed */
    protected b(@o0 View view) {
        this(view, view instanceof qc.a ? (qc.a) view : null);
    }

    @SuppressLint({"RestrictedApi"})
    public boolean a(boolean z4) {
        qc.a aVar = this.f70699d;
        return (aVar instanceof qc.c) && ((qc.c) aVar).a(z4);
    }

    public void d(@l int... iArr) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.d(iArr);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof qc.a) && getView() == ((qc.a) obj).getView();
    }

    public void f(@o0 f fVar, int i4, int i5) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.f(fVar, i4, i5);
    }

    public void g(@o0 f fVar, @o0 com.scwang.smart.refresh.layout.constant.b bVar, @o0 com.scwang.smart.refresh.layout.constant.b bVar2) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        if ((this instanceof qc.c) && (aVar instanceof d)) {
            if (bVar.isFooter) {
                bVar = bVar.toHeader();
            }
            if (bVar2.isFooter) {
                bVar2 = bVar2.toHeader();
            }
        } else if ((this instanceof d) && (aVar instanceof qc.c)) {
            if (bVar.isHeader) {
                bVar = bVar.toFooter();
            }
            if (bVar2.isHeader) {
                bVar2 = bVar2.toFooter();
            }
        }
        qc.a aVar2 = this.f70699d;
        if (aVar2 != null) {
            aVar2.g(fVar, bVar, bVar2);
        }
    }

    @Override // qc.a
    @o0
    public View getView() {
        View view = this.f70697b;
        return view == null ? this : view;
    }

    public void h(@o0 e eVar, int i4, int i5) {
        qc.a aVar = this.f70699d;
        if (aVar != null && aVar != this) {
            aVar.h(eVar, i4, i5);
            return;
        }
        View view = this.f70697b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                eVar.b(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f70618a);
            }
        }
    }

    public int l(@o0 f fVar, boolean z4) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return 0;
        }
        return aVar.l(fVar, z4);
    }

    @Override // qc.a
    public void n(float f4, int i4, int i5) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.n(f4, i4, i5);
    }

    @Override // qc.a
    public boolean o(int i4, float f4, boolean z4) {
        return false;
    }

    @Override // qc.a
    @o0
    public com.scwang.smart.refresh.layout.constant.c p() {
        int i4;
        com.scwang.smart.refresh.layout.constant.c cVar = this.f70698c;
        if (cVar != null) {
            return cVar;
        }
        qc.a aVar = this.f70699d;
        if (aVar != null && aVar != this) {
            return aVar.p();
        }
        View view = this.f70697b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                com.scwang.smart.refresh.layout.constant.c cVar2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f70619b;
                this.f70698c = cVar2;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            if (layoutParams != null && ((i4 = layoutParams.height) == 0 || i4 == -1)) {
                for (com.scwang.smart.refresh.layout.constant.c cVar3 : com.scwang.smart.refresh.layout.constant.c.f70690i) {
                    if (cVar3.f70693c) {
                        this.f70698c = cVar3;
                        return cVar3;
                    }
                }
            }
        }
        com.scwang.smart.refresh.layout.constant.c cVar4 = com.scwang.smart.refresh.layout.constant.c.f70685d;
        this.f70698c = cVar4;
        return cVar4;
    }

    @Override // qc.a
    public boolean q() {
        qc.a aVar = this.f70699d;
        return (aVar == null || aVar == this || !aVar.q()) ? false : true;
    }

    public void r(@o0 f fVar, int i4, int i5) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.r(fVar, i4, i5);
    }

    @Override // qc.a
    public void v(boolean z4, float f4, int i4, int i5, int i6) {
        qc.a aVar = this.f70699d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.v(z4, f4, i4, i5, i6);
    }

    protected b(@o0 View view, @q0 qc.a aVar) {
        super(view.getContext(), null, 0);
        this.f70697b = view;
        this.f70699d = aVar;
        if ((this instanceof qc.c) && (aVar instanceof d) && aVar.p() == com.scwang.smart.refresh.layout.constant.c.f70689h) {
            aVar.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof d) {
            qc.a aVar2 = this.f70699d;
            if ((aVar2 instanceof qc.c) && aVar2.p() == com.scwang.smart.refresh.layout.constant.c.f70689h) {
                aVar.getView().setScaleY(-1.0f);
            }
        }
    }

    protected b(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
