package com.cby.shareboard.action;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.app.h;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: Action.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH&¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020 ¢\u0006\u0004\b1\u00102R!\u00109\u001a\u0002038DX\u0084\u0084\u0002¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010\u0003\u001a\u0004\b6\u00107R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010,\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\bE\u0010,\"\u0004\bF\u0010CR\"\u0010G\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010@\u001a\u0004\bH\u0010,\"\u0004\bI\u0010CR\"\u0010J\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010,\"\u0004\bL\u0010CR\"\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010M\u001a\u0004\b*\u0010)\"\u0004\bN\u0010OR$\u0010P\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u00100\"\u0004\bS\u0010TR\"\u0010\f\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\f\u0010@\u001a\u0004\b-\u0010,\"\u0004\bU\u0010CR\"\u0010V\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010\u0011\"\u0004\bY\u0010&R\"\u0010$\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010W\u001a\u0004\b$\u0010\u0011\"\u0004\b'\u0010&R\"\u0010\t\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010@\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010C¨\u0006\\"}, d2 = {"Lcom/cby/shareboard/action/Action;", "", "<init>", "()V", "", "id", "", "x", "y", "scale", "", "color", "size", "build", "(JFFFIF)Lcom/cby/shareboard/action/Action;", "", "isPoint", "()Z", "sx", "sy", "Lkotlin/k2;", "onStart", "(FF)V", "mx", "my", "onMove", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "isStarted", "clear", "", "msg", "log", "(Ljava/lang/String;)V", "isAdded", "applyAdded", "(Z)V", "setAdded", "getPaintColor", "()I", "getColor", "getPaintSize", "()F", "getSize", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "string", "()Ljava/lang/String;", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "getLogger$annotations", "logger", "J", "getId", "()J", "setId", "(J)V", "startX", "F", "getStartX", "setStartX", "(F)V", "startY", "getStartY", "setStartY", "endX", "getEndX", "setEndX", "endY", "getEndY", "setEndY", "I", "setColor", "(I)V", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "setMPaint", "(Landroid/graphics/Paint;)V", "setSize", "smooth", "Z", "getSmooth", "setSmooth", "getScale", "setScale", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Action {
    private int color;
    private float endX;
    private float endY;
    private long id;
    private boolean isAdded;

    @m
    private Paint mPaint;
    private float size;
    private float startX;
    private float startY;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger = c0.c(new Action$logger$2(this));
    private boolean smooth = true;
    private float scale = 1.0f;

    protected static /* synthetic */ void getLogger$annotations() {
    }

    @i(name = "applyAdded")
    public final void applyAdded(boolean isAdded) {
        this.isAdded = isAdded;
    }

    @l
    public Action build(long id2, float x4, float y4, float scale, int color, float size) {
        this.id = id2;
        this.scale = scale;
        this.startX = x4;
        this.startY = y4;
        this.endX = x4;
        this.endY = y4;
        this.color = color;
        this.size = size * scale;
        Paint paint = new Paint(3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.color);
        paint.setStrokeWidth(this.size);
        this.mPaint = paint;
        return this;
    }

    public void clear() {
    }

    protected final int getColor() {
        return this.color;
    }

    protected final float getEndX() {
        return this.endX;
    }

    protected final float getEndY() {
        return this.endY;
    }

    public final long getId() {
        return this.id;
    }

    @l
    protected final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    @m
    protected final Paint getMPaint() {
        return this.mPaint;
    }

    @m
    public final Paint getPaint() {
        return this.mPaint;
    }

    @i(name = "getPaintColor")
    public final int getPaintColor() {
        return this.color;
    }

    @i(name = "getPaintSize")
    /* renamed from: getPaintSize, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    protected final float getScale() {
        return this.scale;
    }

    protected final float getSize() {
        return this.size;
    }

    protected final boolean getSmooth() {
        return this.smooth;
    }

    protected final float getStartX() {
        return this.startX;
    }

    protected final float getStartY() {
        return this.startY;
    }

    /* renamed from: isAdded, reason: from getter */
    protected final boolean getIsAdded() {
        return this.isAdded;
    }

    public boolean isPoint() {
        return this.startX == this.endX && this.startY == this.endY;
    }

    public abstract boolean isStarted();

    protected final void log(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("ଉ"));
    }

    public abstract void onDraw(@l Canvas canvas);

    public abstract void onMove(float mx, float my);

    public abstract void onStart(float sx, float sy);

    protected final void setAdded(boolean z4) {
        this.isAdded = z4;
    }

    protected final void setColor(int i4) {
        this.color = i4;
    }

    protected final void setEndX(float f4) {
        this.endX = f4;
    }

    protected final void setEndY(float f4) {
        this.endY = f4;
    }

    public final void setId(long j4) {
        this.id = j4;
    }

    protected final void setMPaint(@m Paint paint) {
        this.mPaint = paint;
    }

    protected final void setScale(float f4) {
        this.scale = f4;
    }

    protected final void setSize(float f4) {
        this.size = f4;
    }

    protected final void setSmooth(boolean z4) {
        this.smooth = z4;
    }

    protected final void setStartX(float f4) {
        this.startX = f4;
    }

    protected final void setStartY(float f4) {
        this.startY = f4;
    }

    @l
    public final String string() {
        float f4 = this.startX;
        float f5 = this.startY;
        float f6 = this.endX;
        float f7 = this.endY;
        float f10 = this.scale;
        float f11 = this.size;
        int i4 = this.color;
        boolean z4 = this.smooth;
        boolean z5 = this.isAdded;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ଊ"));
        sb.append(f4);
        sb.append(ProtectedSandApp.s("ଋ"));
        sb.append(f5);
        sb.append(ProtectedSandApp.s("ଌ"));
        sb.append(f6);
        sb.append(ProtectedSandApp.s("\u0b0d"));
        sb.append(f7);
        sb.append(ProtectedSandApp.s("\u0b0e"));
        sb.append(f10);
        sb.append(ProtectedSandApp.s("ଏ"));
        sb.append(f11);
        sb.append(ProtectedSandApp.s("ଐ"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\u0b11"));
        sb.append(z4);
        sb.append(ProtectedSandApp.s("\u0b12"));
        return v.r(h.a(sb, z5, ProtectedSandApp.s("ଓ")), null, 1, null);
    }
}
