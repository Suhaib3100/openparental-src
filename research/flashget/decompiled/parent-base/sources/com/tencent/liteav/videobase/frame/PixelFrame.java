package com.tencent.liteav.videobase.frame;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.k;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.ConsumerChainTimestamp;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.ProducerChainTimestamp;
import java.nio.ByteBuffer;
import java.util.Collection;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class PixelFrame extends i {
    protected ByteBuffer mBuffer;
    private GLConstants.ColorRange mColorRange;
    private GLConstants.ColorSpace mColorSpace;
    protected ConsumerChainTimestamp mConsumerChainTimestamp;
    protected byte[] mData;
    protected Object mGLContext;
    protected int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    protected FrameMetaData mMetaData;
    protected GLConstants.a mPixelBufferType;
    protected GLConstants.PixelFormatType mPixelFormatType;
    protected ProducerChainTimestamp mProducerChainTimestamp;
    private k mRotation;
    protected int mTextureId;
    private long mTimestamp;
    protected int mWidth;

    public PixelFrame() {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = GLConstants.ColorRange.f72143a;
        this.mColorSpace = GLConstants.ColorSpace.f72147a;
        this.mRotation = k.f71939a;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new ConsumerChainTimestamp();
    }

    public static PixelFrame createFromBitmap(Bitmap bitmap) {
        try {
            int width = (bitmap.getWidth() / 2) * 2;
            int height = (bitmap.getHeight() / 2) * 2;
            if (width != 0) {
                if (height != 0) {
                    if (bitmap.getWidth() % 2 == 0) {
                        if (bitmap.getHeight() % 2 != 0) {
                        }
                    }
                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                }
            }
            ByteBuffer b5 = com.tencent.liteav.videobase.utils.d.b(bitmap.getWidth() * 4 * bitmap.getHeight());
            if (b5 == null) {
                return null;
            }
            bitmap.copyPixelsToBuffer(b5);
            b5.position(0);
            PixelFrame pixelFrame = new PixelFrame();
            pixelFrame.setBuffer(b5);
            pixelFrame.setWidth(bitmap.getWidth());
            pixelFrame.setHeight(bitmap.getHeight());
            pixelFrame.setPixelBufferType(GLConstants.a.f72174a);
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.f72161f);
            return pixelFrame;
        } catch (Throwable th) {
            LiteavLog.e(ProtectedSandApp.s("唔\u0001"), ProtectedSandApp.s("唕\u0001"), th);
            return null;
        }
    }

    private int getColorRangeValue() {
        return this.mColorRange.getValue();
    }

    private int getColorSpaceValue() {
        return this.mColorSpace.getValue();
    }

    private int getPixelBufferTypeValue() {
        return this.mPixelBufferType.mValue;
    }

    private int getPixelFormatTypeValue() {
        return this.mPixelFormatType.getValue();
    }

    private int getRotationValue() {
        return this.mRotation.mValue;
    }

    public static void releasePixelFrames(Collection<PixelFrame> collection) {
        if (collection == null) {
            return;
        }
        for (PixelFrame pixelFrame : collection) {
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
        collection.clear();
    }

    public void copy(PixelFrame pixelFrame) {
        this.mTimestamp = pixelFrame.mTimestamp;
        this.mWidth = pixelFrame.mWidth;
        this.mHeight = pixelFrame.mHeight;
        this.mPixelBufferType = pixelFrame.mPixelBufferType;
        this.mPixelFormatType = pixelFrame.mPixelFormatType;
        this.mRotation = pixelFrame.mRotation;
        this.mIsMirrorHorizontal = pixelFrame.mIsMirrorHorizontal;
        this.mIsMirrorVertical = pixelFrame.mIsMirrorVertical;
        if (pixelFrame.mMatrix != null) {
            this.mMatrix = new float[16];
            float[] matrix = pixelFrame.getMatrix();
            float[] fArr = this.mMatrix;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        }
        this.mMatrix = pixelFrame.mMatrix;
        this.mData = pixelFrame.mData;
        this.mBuffer = pixelFrame.mBuffer;
        this.mTextureId = pixelFrame.mTextureId;
        this.mGLContext = pixelFrame.mGLContext;
        this.mMetaData = pixelFrame.mMetaData;
        this.mConsumerChainTimestamp = pixelFrame.mConsumerChainTimestamp;
        this.mProducerChainTimestamp = pixelFrame.mProducerChainTimestamp;
        this.mColorSpace = pixelFrame.mColorSpace;
        this.mColorRange = pixelFrame.mColorRange;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public GLConstants.ColorRange getColorRange() {
        return this.mColorRange;
    }

    public GLConstants.ColorSpace getColorSpace() {
        return this.mColorSpace;
    }

    public ConsumerChainTimestamp getConsumerChainTimestamp() {
        if (this.mConsumerChainTimestamp == null) {
            this.mConsumerChainTimestamp = new ConsumerChainTimestamp();
        }
        return this.mConsumerChainTimestamp;
    }

    public byte[] getData() {
        return this.mData;
    }

    public Object getGLContext() {
        return this.mGLContext;
    }

    public long getGLContextNativeHandle() {
        return OpenGlUtils.getGLContextNativeHandle(this.mGLContext);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public float[] getMatrix() {
        return this.mMatrix;
    }

    public FrameMetaData getMetaData() {
        return this.mMetaData;
    }

    public GLConstants.a getPixelBufferType() {
        return this.mPixelBufferType;
    }

    public GLConstants.PixelFormatType getPixelFormatType() {
        return this.mPixelFormatType;
    }

    public ProducerChainTimestamp getProducerChainTimestamp() {
        if (this.mProducerChainTimestamp == null) {
            this.mProducerChainTimestamp = new ProducerChainTimestamp();
        }
        return this.mProducerChainTimestamp;
    }

    public k getRotation() {
        return this.mRotation;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean hasTransformParams() {
        return this.mRotation != k.f71939a || this.mIsMirrorHorizontal || this.mIsMirrorVertical || this.mMatrix != null;
    }

    public boolean isFrameDataValid() {
        GLConstants.a aVar = this.mPixelBufferType;
        if (aVar == GLConstants.a.f72175b && this.mTextureId == -1) {
            return false;
        }
        if (aVar == GLConstants.a.f72174a && this.mBuffer == null) {
            return false;
        }
        return (aVar == GLConstants.a.f72177d && this.mData == null) ? false : true;
    }

    public boolean isMirrorHorizontal() {
        return this.mIsMirrorHorizontal;
    }

    public boolean isMirrorVertical() {
        return this.mIsMirrorVertical;
    }

    public void postRotate(k kVar) {
        if (kVar == k.f71940b || kVar == k.f71942d) {
            swapWidthHeight();
        }
        setRotation(k.a((this.mRotation.mValue + kVar.mValue) % 360));
    }

    @Override // com.tencent.liteav.videobase.frame.i
    public void release() {
        super.release();
    }

    protected void reset() {
        this.mTimestamp = 0L;
        this.mRotation = k.f71939a;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mMetaData = null;
        this.mProducerChainTimestamp = null;
        this.mConsumerChainTimestamp = null;
        this.mColorRange = GLConstants.ColorRange.f72143a;
        this.mColorSpace = GLConstants.ColorSpace.f72147a;
    }

    @Override // com.tencent.liteav.videobase.frame.i
    public int retain() {
        return super.retain();
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void setColorRange(GLConstants.ColorRange colorRange) {
        this.mColorRange = colorRange;
    }

    public void setColorSpace(GLConstants.ColorSpace colorSpace) {
        this.mColorSpace = colorSpace;
    }

    public void setConsumerChainTimestamp(ConsumerChainTimestamp consumerChainTimestamp) {
        this.mConsumerChainTimestamp = consumerChainTimestamp;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setHeight(int i4) {
        this.mHeight = i4;
    }

    public void setMatrix(float[] fArr) {
        this.mMatrix = fArr;
    }

    public void setMetaData(FrameMetaData frameMetaData) {
        this.mMetaData = frameMetaData;
    }

    public void setMirrorHorizontal(boolean z4) {
        this.mIsMirrorHorizontal = z4;
    }

    public void setMirrorVertical(boolean z4) {
        this.mIsMirrorVertical = z4;
    }

    public void setPixelBufferType(GLConstants.a aVar) {
        this.mPixelBufferType = aVar;
    }

    public void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
        this.mPixelFormatType = pixelFormatType;
    }

    public void setProducerChainTimestamp(ProducerChainTimestamp producerChainTimestamp) {
        this.mProducerChainTimestamp = producerChainTimestamp;
    }

    public void setRotation(k kVar) {
        this.mRotation = kVar;
    }

    public void setTextureId(int i4) {
        this.mTextureId = i4;
    }

    public void setTimestamp(long j4) {
        this.mTimestamp = j4;
    }

    public void setWidth(int i4) {
        this.mWidth = i4;
    }

    public void swapWidthHeight() {
        int i4 = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i4;
    }

    public PixelFrame(PixelFrame pixelFrame) {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = GLConstants.ColorRange.f72143a;
        this.mColorSpace = GLConstants.ColorSpace.f72147a;
        this.mRotation = k.f71939a;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new ConsumerChainTimestamp();
        copy(pixelFrame);
    }

    public PixelFrame(int i4, int i5, int i6, int i7, int i10) {
        this(null, i4, i5, i6, GLConstants.a.a(i7), GLConstants.PixelFormatType.a(i10));
    }

    public PixelFrame(g<PixelFrame> gVar, int i4, int i5, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
        this(gVar, i4, i5, pixelFormatType == GLConstants.PixelFormatType.f72161f ? i4 * i5 * 4 : ((i4 * i5) * 3) / 2, aVar, pixelFormatType);
    }

    public PixelFrame(g<PixelFrame> gVar, int i4, int i5, int i6, GLConstants.a aVar, GLConstants.PixelFormatType pixelFormatType) {
        super(gVar);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = GLConstants.ColorRange.f72143a;
        this.mColorSpace = GLConstants.ColorSpace.f72147a;
        this.mRotation = k.f71939a;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new ConsumerChainTimestamp();
        this.mWidth = i4;
        this.mHeight = i5;
        this.mPixelFormatType = pixelFormatType;
        this.mPixelBufferType = aVar;
        if (aVar == GLConstants.a.f72177d) {
            this.mData = com.tencent.liteav.videobase.utils.d.a(i6);
        } else {
            this.mBuffer = com.tencent.liteav.videobase.utils.d.b(i6);
        }
    }

    protected PixelFrame(g<? extends PixelFrame> gVar) {
        super(gVar);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = GLConstants.ColorRange.f72143a;
        this.mColorSpace = GLConstants.ColorSpace.f72147a;
        this.mRotation = k.f71939a;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new ConsumerChainTimestamp();
    }
}
