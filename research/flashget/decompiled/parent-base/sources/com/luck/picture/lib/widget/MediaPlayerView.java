package com.luck.picture.lib.widget;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.IOException;

/* loaded from: classes6.dex */
public class MediaPlayerView extends FrameLayout implements SurfaceHolder.Callback {
    private MediaPlayer mediaPlayer;
    private VideoSurfaceView surfaceView;

    public static class VideoSurfaceView extends SurfaceView {
        private int videoHeight;
        private int videoWidth;

        public VideoSurfaceView(Context context) {
            this(context, null);
        }

        public void adjustVideoSize(int i4, int i5) {
            if (i4 == 0 || i5 == 0) {
                return;
            }
            this.videoWidth = i4;
            this.videoHeight = i5;
            getHolder().setFixedSize(i4, i5);
            requestLayout();
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r1 > r6) goto L28;
         */
        @Override // android.view.SurfaceView, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void onMeasure(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.videoWidth
                int r0 = android.view.View.getDefaultSize(r0, r6)
                int r1 = r5.videoHeight
                int r1 = android.view.View.getDefaultSize(r1, r7)
                int r2 = r5.videoWidth
                if (r2 <= 0) goto L7a
                int r2 = r5.videoHeight
                if (r2 <= 0) goto L7a
                int r0 = android.view.View.MeasureSpec.getMode(r6)
                int r6 = android.view.View.MeasureSpec.getSize(r6)
                int r1 = android.view.View.MeasureSpec.getMode(r7)
                int r7 = android.view.View.MeasureSpec.getSize(r7)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r0 != r2) goto L43
                if (r1 != r2) goto L43
                int r0 = r5.videoWidth
                int r1 = r0 * r7
                int r2 = r5.videoHeight
                int r3 = r6 * r2
                if (r1 >= r3) goto L38
                int r0 = r0 * r7
                int r0 = r0 / r2
            L36:
                r1 = r7
                goto L7a
            L38:
                int r1 = r0 * r7
                int r3 = r6 * r2
                if (r1 <= r3) goto L60
                int r2 = r2 * r6
                int r1 = r2 / r0
            L41:
                r0 = r6
                goto L7a
            L43:
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r2) goto L54
                int r0 = r5.videoHeight
                int r0 = r0 * r6
                int r2 = r5.videoWidth
                int r0 = r0 / r2
                if (r1 != r3) goto L52
                if (r0 <= r7) goto L52
                goto L60
            L52:
                r1 = r0
                goto L41
            L54:
                if (r1 != r2) goto L64
                int r1 = r5.videoWidth
                int r1 = r1 * r7
                int r2 = r5.videoHeight
                int r1 = r1 / r2
                if (r0 != r3) goto L62
                if (r1 <= r6) goto L62
            L60:
                r0 = r6
                goto L36
            L62:
                r0 = r1
                goto L36
            L64:
                int r2 = r5.videoWidth
                int r4 = r5.videoHeight
                if (r1 != r3) goto L70
                if (r4 <= r7) goto L70
                int r1 = r7 * r2
                int r1 = r1 / r4
                goto L72
            L70:
                r1 = r2
                r7 = r4
            L72:
                if (r0 != r3) goto L62
                if (r1 <= r6) goto L62
                int r4 = r4 * r6
                int r1 = r4 / r2
                goto L41
            L7a:
                r5.setMeasuredDimension(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.MediaPlayerView.VideoSurfaceView.onMeasure(int, int):void");
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public VideoSurfaceView(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
        }
    }

    public MediaPlayerView(@o0 Context context) {
        super(context);
        init();
    }

    private void init() {
        this.surfaceView = new VideoSurfaceView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.surfaceView.setLayoutParams(layoutParams);
        addView(this.surfaceView);
        SurfaceHolder holder = this.surfaceView.getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public void clearCanvas() {
        this.surfaceView.getHolder().setFormat(-1);
        this.surfaceView.getHolder().setFormat(-2);
    }

    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public VideoSurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    public MediaPlayer initMediaPlayer() {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = new MediaPlayer();
        }
        this.mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.luck.picture.lib.widget.MediaPlayerView.1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i4, int i5) {
                MediaPlayerView.this.surfaceView.adjustVideoSize(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            }
        });
        return this.mediaPlayer;
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer.setOnPreparedListener(null);
            this.mediaPlayer.setOnCompletionListener(null);
            this.mediaPlayer.setOnErrorListener(null);
            this.mediaPlayer = null;
        }
    }

    public void start(String str) {
        try {
            if (PictureMimeType.isContent(str)) {
                this.mediaPlayer.setDataSource(getContext(), Uri.parse(str));
            } else {
                this.mediaPlayer.setDataSource(str);
            }
            this.mediaPlayer.prepareAsync();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@o0 SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@o0 SurfaceHolder surfaceHolder) {
        this.mediaPlayer.setAudioStreamType(3);
        this.mediaPlayer.setDisplay(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@o0 SurfaceHolder surfaceHolder) {
    }

    public MediaPlayerView(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MediaPlayerView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
