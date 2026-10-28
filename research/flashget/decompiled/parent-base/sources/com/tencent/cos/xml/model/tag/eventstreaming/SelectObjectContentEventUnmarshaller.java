package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.d;
import android.util.Xml;
import androidx.appcompat.view.g;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public abstract class SelectObjectContentEventUnmarshaller {

    public static class ContinuationEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.ContinuationEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.ContinuationEvent();
        }
    }

    public static class EndEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.EndEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.EndEvent();
        }
    }

    public static class ProgressEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.ProgressEvent unmarshal(Message message) throws Exception {
            return new SelectObjectContentEvent.ProgressEvent().withDetails(SelectObjectContentEventUnmarshaller.parsePayloadProgress(message));
        }
    }

    public static class RecordsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.RecordsEvent unmarshal(Message message) {
            return new SelectObjectContentEvent.RecordsEvent().withPayload(ByteBuffer.wrap(message.getPayload()));
        }
    }

    public static class StatsEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent.StatsEvent unmarshal(Message message) throws Exception {
            return new SelectObjectContentEvent.StatsEvent().withDetails(SelectObjectContentEventUnmarshaller.parsePayloadStats(message));
        }
    }

    public static class UnknownEventUnmarshaller extends SelectObjectContentEventUnmarshaller {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEventUnmarshaller
        public SelectObjectContentEvent unmarshal(Message message) {
            return new SelectObjectContentEvent();
        }
    }

    public static SelectObjectContentEventUnmarshaller forEventType(String str) {
        return ProtectedSandApp.s("争\u0001").equals(str) ? new RecordsEventUnmarshaller() : ProtectedSandApp.s("亊\u0001").equals(str) ? new StatsEventUnmarshaller() : ProtectedSandApp.s("事\u0001").equals(str) ? new ProgressEventUnmarshaller() : ProtectedSandApp.s("二\u0001").equals(str) ? new ContinuationEventUnmarshaller() : ProtectedSandApp.s("亍\u0001").equals(str) ? new EndEventUnmarshaller() : new UnknownEventUnmarshaller();
    }

    private static String getStringHeader(Message message, String str) throws CosXmlServiceException {
        HeaderValue headerValue = message.getHeaders().get(str);
        if (headerValue == null) {
            throw new CosXmlServiceException(d.a(ProtectedSandApp.s("亐\u0001"), str, ProtectedSandApp.s("云\u0001")), (String) null);
        }
        if (headerValue.getType() == HeaderType.STRING) {
            return headerValue.getString();
        }
        StringBuilder a5 = g.a(ProtectedSandApp.s("于\u0001"), str, ProtectedSandApp.s("亏\u0001"));
        a5.append(headerValue.getType());
        throw new CosXmlServiceException(a5.toString(), (String) null);
    }

    private static long[] parsePayloadBytesProgress(Message message) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(new ByteArrayInputStream(message.getPayload()), ProtectedSandApp.s("互\u0001"));
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("亓\u0001"))) {
                    newPullParser.next();
                    j4 = Long.parseLong(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("五\u0001"))) {
                    newPullParser.next();
                    j5 = Long.parseLong(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("井\u0001"))) {
                    newPullParser.next();
                    j6 = Long.parseLong(newPullParser.getText());
                }
            }
        }
        return new long[]{j4, j5, j6};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Progress parsePayloadProgress(Message message) throws XmlPullParserException, IOException {
        long[] parsePayloadBytesProgress = parsePayloadBytesProgress(message);
        return new Progress(Long.valueOf(parsePayloadBytesProgress[0]), Long.valueOf(parsePayloadBytesProgress[1]), Long.valueOf(parsePayloadBytesProgress[2]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Stats parsePayloadStats(Message message) throws XmlPullParserException, IOException {
        long[] parsePayloadBytesProgress = parsePayloadBytesProgress(message);
        return new Stats(Long.valueOf(parsePayloadBytesProgress[0]), Long.valueOf(parsePayloadBytesProgress[1]), Long.valueOf(parsePayloadBytesProgress[2]));
    }

    private static CosXmlServiceException unmarshalErrorMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ProtectedSandApp.s("亖\u0001"));
        String stringHeader2 = getStringHeader(message, ProtectedSandApp.s("亗\u0001"));
        SelectObjectContentEventException selectObjectContentEventException = new SelectObjectContentEventException(c.a(ProtectedSandApp.s("亘\u0001"), stringHeader2, ProtectedSandApp.s("亙\u0001"), stringHeader, ProtectedSandApp.s("亚\u0001")));
        selectObjectContentEventException.setErrorCode(stringHeader);
        selectObjectContentEventException.setErrorMessage(stringHeader2);
        return new CosXmlServiceException(ProtectedSandApp.s("些\u0001"), selectObjectContentEventException);
    }

    private static SelectObjectContentEvent unmarshalEventMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ProtectedSandApp.s("亜\u0001"));
        try {
            return forEventType(stringHeader).unmarshal(message);
        } catch (Exception e4) {
            throw new CosXmlServiceException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("亝\u0001"), stringHeader), e4);
        }
    }

    public static SelectObjectContentEvent unmarshalMessage(Message message) throws CosXmlServiceException {
        String stringHeader = getStringHeader(message, ProtectedSandApp.s("亞\u0001"));
        if (ProtectedSandApp.s("亟\u0001").equals(stringHeader)) {
            throw unmarshalErrorMessage(message);
        }
        if (ProtectedSandApp.s("亠\u0001").equals(stringHeader)) {
            return unmarshalEventMessage(message);
        }
        throw new CosXmlServiceException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("亡\u0001"), stringHeader), (String) null);
    }

    public abstract SelectObjectContentEvent unmarshal(Message message) throws Exception;
}
