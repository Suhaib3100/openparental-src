package pb;

import android.widget.AbsListView;

/* compiled from: PauseOnScrollListener.java */
/* loaded from: classes6.dex */
public class c implements AbsListView.OnScrollListener {

    /* renamed from: b, reason: collision with root package name */
    private com.nostra13.universalimageloader.core.d f88689b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f88690c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f88691d;

    /* renamed from: e, reason: collision with root package name */
    private final AbsListView.OnScrollListener f88692e;

    public c(com.nostra13.universalimageloader.core.d dVar, boolean z4, boolean z5) {
        this(dVar, z4, z5, null);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        AbsListView.OnScrollListener onScrollListener = this.f88692e;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            this.f88689b.O();
        } else if (i4 != 1) {
            if (i4 == 2 && this.f88691d) {
                this.f88689b.N();
            }
        } else if (this.f88690c) {
            this.f88689b.N();
        }
        AbsListView.OnScrollListener onScrollListener = this.f88692e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i4);
        }
    }

    public c(com.nostra13.universalimageloader.core.d dVar, boolean z4, boolean z5, AbsListView.OnScrollListener onScrollListener) {
        this.f88689b = dVar;
        this.f88690c = z4;
        this.f88691d = z5;
        this.f88692e = onScrollListener;
    }
}
