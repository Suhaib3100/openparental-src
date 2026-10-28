package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureConfig;
import com.tencent.beacon.event.open.EventResult;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ExtensionDescriptor.java */
@g(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, UserData.IS91_MSG_TYPE_CLI, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 135, SyslogAppender.LOG_LOCAL1, 137, 138, 139, SmsConstants.MAX_USER_DATA_BYTES, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, SyslogAppender.LOG_LOCAL3, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, SyslogAppender.LOG_LOCAL5, 169, 170, 171, 172, 173, 174, 175, SyslogAppender.LOG_LOCAL6, 177, 178, 179, 180, 181, 182, 183, SyslogAppender.LOG_LOCAL7, 185, 186, 187, PictureConfig.CHOOSE_REQUEST, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, EventResult.ERROR_CODE_OTHER, 200, 201, 202, 203, 204, HttpStatus.SC_RESET_CONTENT, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
/* loaded from: classes6.dex */
public class i extends b {

    /* renamed from: f, reason: collision with root package name */
    private static Logger f63994f = Logger.getLogger(i.class.getName());

    /* renamed from: e, reason: collision with root package name */
    ByteBuffer f63995e;

    static int[] i() {
        int[] iArr = new int[148];
        for (int i4 = 106; i4 < 254; i4++) {
            int i5 = i4 - 106;
            f63994f.finest(ProtectedSandApp.s("ፇ\u0001") + i5);
            iArr[i5] = i4;
        }
        return iArr;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    int a() {
        return this.f63995e.remaining();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f63995e = byteBuffer.slice();
        byteBuffer.position(this.f63995e.remaining() + byteBuffer.position());
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public ByteBuffer g() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        com.coremedia.iso.i.m(allocate, this.f63958a);
        h(allocate, a());
        allocate.put(this.f63995e.duplicate());
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return ProtectedSandApp.s("ፈ\u0001") + this.f63958a + ProtectedSandApp.s("ፉ\u0001") + com.coremedia.iso.e.b(this.f63995e.array()) + '}';
    }
}
