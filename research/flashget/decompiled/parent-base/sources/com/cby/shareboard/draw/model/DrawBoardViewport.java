package com.cby.shareboard.draw.model;

import fg.l;
import fg.m;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: DrawBoardViewport.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/cby/shareboard/draw/model/DrawBoardViewport;", "", "size", "Lcom/cby/shareboard/draw/model/DrawBoardSize;", "offsetX", "", "offsetY", "scale", "(Lcom/cby/shareboard/draw/model/DrawBoardSize;FFF)V", "copy", "equals", "", "o", "getOffsetX", "getOffsetY", "getScale", "getSize", "hashCode", "", "Companion", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawBoardViewport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    @l
    private static final DrawBoardViewport IDLE = new DrawBoardViewport(DrawBoardSize.INSTANCE.getZERO(), 0.0f, 0.0f, 1.0f);
    private float offsetX;
    private float offsetY;
    private float scale;

    @m
    private DrawBoardSize size;

    /* compiled from: DrawBoardViewport.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/cby/shareboard/draw/model/DrawBoardViewport$Companion;", "", "()V", "IDLE", "Lcom/cby/shareboard/draw/model/DrawBoardViewport;", "getIDLE", "()Lcom/cby/shareboard/draw/model/DrawBoardViewport;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final DrawBoardViewport getIDLE() {
            return DrawBoardViewport.IDLE;
        }

        private Companion() {
        }
    }

    public DrawBoardViewport(@m DrawBoardSize drawBoardSize, float f4, float f5, float f6) {
        this.size = drawBoardSize;
        this.offsetX = f4;
        this.offsetY = f5;
        this.scale = f6;
    }

    @l
    public final DrawBoardViewport copy() {
        return new DrawBoardViewport(this.size, this.offsetX, this.offsetY, this.scale);
    }

    public boolean equals(@m Object o4) {
        DrawBoardSize drawBoardSize;
        if (this == o4) {
            return true;
        }
        if (o4 == null || !l0.g(DrawBoardViewport.class, o4.getClass())) {
            return false;
        }
        DrawBoardViewport drawBoardViewport = (DrawBoardViewport) o4;
        return Float.compare(drawBoardViewport.offsetX, this.offsetX) == 0 && Float.compare(drawBoardViewport.offsetY, this.offsetY) == 0 && Float.compare(drawBoardViewport.scale, this.scale) == 0 && (drawBoardSize = this.size) != null && drawBoardSize.equals(drawBoardViewport.size);
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getScale() {
        return this.scale;
    }

    @m
    public final DrawBoardSize getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(this.size, Float.valueOf(this.offsetX), Float.valueOf(this.offsetY), Float.valueOf(this.scale));
    }
}
