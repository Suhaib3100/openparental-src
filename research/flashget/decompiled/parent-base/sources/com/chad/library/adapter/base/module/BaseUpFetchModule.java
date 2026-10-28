package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnUpFetchListener;
import com.chad.library.adapter.base.listener.UpFetchListenerImp;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: UpFetchModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\nR\u001c\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006 "}, d2 = {"Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "Lcom/chad/library/adapter/base/listener/UpFetchListenerImp;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "", "position", "Lkotlin/k2;", "autoUpFetch$com_github_CymChad_brvah", "(I)V", "autoUpFetch", "Lcom/chad/library/adapter/base/listener/OnUpFetchListener;", "listener", "setOnUpFetchListener", "(Lcom/chad/library/adapter/base/listener/OnUpFetchListener;)V", "mUpFetchListener", "Lcom/chad/library/adapter/base/listener/OnUpFetchListener;", "", "isUpFetchEnable", "Z", "()Z", "setUpFetchEnable", "(Z)V", "isUpFetching", "setUpFetching", "startUpFetchPosition", "I", "getStartUpFetchPosition", "()I", "setStartUpFetchPosition", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class BaseUpFetchModule implements UpFetchListenerImp {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isUpFetchEnable;
    private boolean isUpFetching;
    private OnUpFetchListener mUpFetchListener;
    private int startUpFetchPosition;

    public BaseUpFetchModule(@l BaseQuickAdapter<?, ?> baseQuickAdapter) {
        l0.q(baseQuickAdapter, ProtectedSandApp.s("\u0efe"));
        this.baseQuickAdapter = baseQuickAdapter;
        this.startUpFetchPosition = 1;
    }

    public final void autoUpFetch$com_github_CymChad_brvah(int position) {
        OnUpFetchListener onUpFetchListener;
        if (!this.isUpFetchEnable || this.isUpFetching || position > this.startUpFetchPosition || (onUpFetchListener = this.mUpFetchListener) == null) {
            return;
        }
        onUpFetchListener.onUpFetch();
    }

    public final int getStartUpFetchPosition() {
        return this.startUpFetchPosition;
    }

    /* renamed from: isUpFetchEnable, reason: from getter */
    public final boolean getIsUpFetchEnable() {
        return this.isUpFetchEnable;
    }

    /* renamed from: isUpFetching, reason: from getter */
    public final boolean getIsUpFetching() {
        return this.isUpFetching;
    }

    @Override // com.chad.library.adapter.base.listener.UpFetchListenerImp
    public void setOnUpFetchListener(@m OnUpFetchListener listener) {
        this.mUpFetchListener = listener;
    }

    public final void setStartUpFetchPosition(int i4) {
        this.startUpFetchPosition = i4;
    }

    public final void setUpFetchEnable(boolean z4) {
        this.isUpFetchEnable = z4;
    }

    public final void setUpFetching(boolean z4) {
        this.isUpFetching = z4;
    }
}
