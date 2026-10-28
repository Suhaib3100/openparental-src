package com.chad.library.adapter.base;

import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.u0;
import kotlin.reflect.h;

/* compiled from: BaseQuickAdapter.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
/* loaded from: classes3.dex */
final /* synthetic */ class BaseQuickAdapter$hasFooterLayout$1 extends u0 {
    BaseQuickAdapter$hasFooterLayout$1(BaseQuickAdapter baseQuickAdapter) {
        super(baseQuickAdapter);
    }

    @Override // kotlin.reflect.p
    @m
    public Object get() {
        return BaseQuickAdapter.access$getMFooterLayout$p((BaseQuickAdapter) this.receiver);
    }

    @Override // kotlin.jvm.internal.q, kotlin.reflect.c
    public String getName() {
        return ProtectedSandApp.s("ຠ");
    }

    @Override // kotlin.jvm.internal.q
    public h getOwner() {
        return l1.d(BaseQuickAdapter.class);
    }

    @Override // kotlin.jvm.internal.q
    public String getSignature() {
        return ProtectedSandApp.s("ມ");
    }

    @Override // kotlin.reflect.k
    public void set(@m Object obj) {
        ((BaseQuickAdapter) this.receiver).mFooterLayout = (LinearLayout) obj;
    }
}
