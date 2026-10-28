package org.eclipse.paho.client.mqttv3.internal;

import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttAck;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnack;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPingReq;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPingResp;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPubAck;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPubComp;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPubRec;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPubRel;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttSuback;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttSubscribe;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttUnsubAck;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttUnsubscribe;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes5.dex */
public class ClientState {
    private static final int MAX_MSG_ID = 65535;
    private static final int MIN_MSG_ID = 1;
    private int actualInFlight;
    private CommsCallback callback;
    private boolean cleanSession;
    private ClientComms clientComms;
    private int inFlightPubRels;
    private Hashtable inUseMsgIds;
    private Hashtable inboundQoS2;
    private long keepAlive;
    private Hashtable outboundQoS0;
    private Hashtable outboundQoS1;
    private Hashtable outboundQoS2;
    private volatile Vector pendingFlows;
    private volatile Vector pendingMessages;
    private MqttClientPersistence persistence;
    private MqttWireMessage pingCommand;
    private MqttPingSender pingSender;
    private CommsTokenStore tokenStore;
    private static final String PERSISTENCE_SENT_PREFIX = ProtectedSandApp.s("\uef42");
    private static final String PERSISTENCE_SENT_BUFFERED_PREFIX = ProtectedSandApp.s("\uef43");
    private static final String PERSISTENCE_CONFIRMED_PREFIX = ProtectedSandApp.s("\uef44");
    private static final String PERSISTENCE_RECEIVED_PREFIX = ProtectedSandApp.s("\uef45");
    private static final String CLASS_NAME = ProtectedSandApp.s("\uef46");
    private static final Logger log = LoggerFactory.getLogger(ProtectedSandApp.s("\uef47"), ClientState.class.getName());
    private int nextMsgId = 0;
    private int maxInflight = 0;
    private Object queueLock = new Object();
    private Object quiesceLock = new Object();
    private boolean quiescing = false;
    private long lastOutboundActivity = 0;
    private long lastInboundActivity = 0;
    private long lastPing = 0;
    private Object pingOutstandingLock = new Object();
    private int pingOutstanding = 0;
    private boolean connected = false;

    protected ClientState(MqttClientPersistence mqttClientPersistence, CommsTokenStore commsTokenStore, CommsCallback commsCallback, ClientComms clientComms, MqttPingSender mqttPingSender) throws MqttException {
        this.clientComms = null;
        this.callback = null;
        this.actualInFlight = 0;
        this.inFlightPubRels = 0;
        this.outboundQoS2 = null;
        this.outboundQoS1 = null;
        this.outboundQoS0 = null;
        this.inboundQoS2 = null;
        this.pingSender = null;
        Logger logger = log;
        logger.setResourceName(clientComms.getClient().getClientId());
        logger.finer(CLASS_NAME, ProtectedSandApp.s("\uef48"), "");
        this.inUseMsgIds = new Hashtable();
        this.pendingFlows = new Vector();
        this.outboundQoS2 = new Hashtable();
        this.outboundQoS1 = new Hashtable();
        this.outboundQoS0 = new Hashtable();
        this.inboundQoS2 = new Hashtable();
        this.pingCommand = new MqttPingReq();
        this.inFlightPubRels = 0;
        this.actualInFlight = 0;
        this.persistence = mqttClientPersistence;
        this.callback = commsCallback;
        this.tokenStore = commsTokenStore;
        this.clientComms = clientComms;
        this.pingSender = mqttPingSender;
        restoreState();
    }

    private void decrementInFlight() {
        synchronized (this.queueLock) {
            try {
                int i4 = this.actualInFlight - 1;
                this.actualInFlight = i4;
                log.fine(CLASS_NAME, ProtectedSandApp.s("\uef49"), ProtectedSandApp.s("\uef4a"), new Object[]{new Integer(i4)});
                if (!checkQuiesceLock()) {
                    this.queueLock.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int getNextMessageId() throws MqttException {
        int i4;
        try {
            int i5 = this.nextMsgId;
            int i6 = 0;
            do {
                int i7 = this.nextMsgId + 1;
                this.nextMsgId = i7;
                if (i7 > 65535) {
                    this.nextMsgId = 1;
                }
                i4 = this.nextMsgId;
                if (i4 == i5 && (i6 = i6 + 1) == 2) {
                    throw ExceptionHelper.createMqttException(32001);
                }
            } while (this.inUseMsgIds.containsKey(new Integer(i4)));
            Integer num = new Integer(this.nextMsgId);
            this.inUseMsgIds.put(num, num);
        } catch (Throwable th) {
            throw th;
        }
        return this.nextMsgId;
    }

    private String getReceivedPersistenceKey(MqttWireMessage mqttWireMessage) {
        return ProtectedSandApp.s("\uef45") + mqttWireMessage.getMessageId();
    }

    private String getSendBufferedPersistenceKey(MqttWireMessage mqttWireMessage) {
        return ProtectedSandApp.s("\uef43") + mqttWireMessage.getMessageId();
    }

    private String getSendConfirmPersistenceKey(MqttWireMessage mqttWireMessage) {
        return ProtectedSandApp.s("\uef44") + mqttWireMessage.getMessageId();
    }

    private String getSendPersistenceKey(MqttWireMessage mqttWireMessage) {
        return ProtectedSandApp.s("\uef42") + mqttWireMessage.getMessageId();
    }

    private void insertInOrder(Vector vector, MqttWireMessage mqttWireMessage) {
        int messageId = mqttWireMessage.getMessageId();
        for (int i4 = 0; i4 < vector.size(); i4++) {
            if (((MqttWireMessage) vector.elementAt(i4)).getMessageId() > messageId) {
                vector.insertElementAt(mqttWireMessage, i4);
                return;
            }
        }
        vector.addElement(mqttWireMessage);
    }

    private Vector reOrder(Vector vector) {
        Vector vector2 = new Vector();
        if (vector.size() == 0) {
            return vector2;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < vector.size()) {
            int messageId = ((MqttWireMessage) vector.elementAt(i4)).getMessageId();
            int i10 = messageId - i5;
            if (i10 > i6) {
                i7 = i4;
                i6 = i10;
            }
            i4++;
            i5 = messageId;
        }
        int i11 = (65535 - i5) + ((MqttWireMessage) vector.elementAt(0)).getMessageId() > i6 ? 0 : i7;
        for (int i12 = i11; i12 < vector.size(); i12++) {
            vector2.addElement(vector.elementAt(i12));
        }
        for (int i13 = 0; i13 < i11; i13++) {
            vector2.addElement(vector.elementAt(i13));
        }
        return vector2;
    }

    private synchronized void releaseMessageId(int i4) {
        this.inUseMsgIds.remove(new Integer(i4));
    }

    private void restoreInflightMessages() {
        String s4;
        this.pendingMessages = new Vector(this.maxInflight);
        this.pendingFlows = new Vector();
        Enumeration keys = this.outboundQoS2.keys();
        while (true) {
            boolean hasMoreElements = keys.hasMoreElements();
            s4 = ProtectedSandApp.s("\uef4b");
            if (!hasMoreElements) {
                break;
            }
            Object nextElement = keys.nextElement();
            MqttWireMessage mqttWireMessage = (MqttWireMessage) this.outboundQoS2.get(nextElement);
            if (mqttWireMessage instanceof MqttPublish) {
                log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef4e"), new Object[]{nextElement});
                mqttWireMessage.setDuplicate(true);
                insertInOrder(this.pendingMessages, (MqttPublish) mqttWireMessage);
            } else if (mqttWireMessage instanceof MqttPubRel) {
                log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef4f"), new Object[]{nextElement});
                insertInOrder(this.pendingFlows, (MqttPubRel) mqttWireMessage);
            }
        }
        Enumeration keys2 = this.outboundQoS1.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            MqttPublish mqttPublish = (MqttPublish) this.outboundQoS1.get(nextElement2);
            mqttPublish.setDuplicate(true);
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef4d"), new Object[]{nextElement2});
            insertInOrder(this.pendingMessages, mqttPublish);
        }
        Enumeration keys3 = this.outboundQoS0.keys();
        while (keys3.hasMoreElements()) {
            Object nextElement3 = keys3.nextElement();
            MqttPublish mqttPublish2 = (MqttPublish) this.outboundQoS0.get(nextElement3);
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef4c"), new Object[]{nextElement3});
            insertInOrder(this.pendingMessages, mqttPublish2);
        }
        this.pendingFlows = reOrder(this.pendingFlows);
        this.pendingMessages = reOrder(this.pendingMessages);
    }

    private MqttWireMessage restoreMessage(String str, MqttPersistable mqttPersistable) throws MqttException {
        MqttWireMessage mqttWireMessage;
        try {
            mqttWireMessage = MqttWireMessage.createWireMessage(mqttPersistable);
        } catch (MqttException e4) {
            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef51"), ProtectedSandApp.s("\uef50"), new Object[]{str}, e4);
            if (!(e4.getCause() instanceof EOFException)) {
                throw e4;
            }
            if (str != null) {
                this.persistence.remove(str);
            }
            mqttWireMessage = null;
        }
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef51"), ProtectedSandApp.s("\uef52"), new Object[]{str, mqttWireMessage});
        return mqttWireMessage;
    }

    public MqttToken checkForActivity(IMqttActionListener iMqttActionListener) throws MqttException {
        Object obj;
        long max;
        Logger logger = log;
        String str = CLASS_NAME;
        logger.fine(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef54"), new Object[0]);
        synchronized (this.quiesceLock) {
            try {
                MqttToken mqttToken = null;
                if (this.quiescing) {
                    return null;
                }
                getKeepAlive();
                if (this.connected && this.keepAlive > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Object obj2 = this.pingOutstandingLock;
                    synchronized (obj2) {
                        try {
                            try {
                                int i4 = this.pingOutstanding;
                                if (i4 > 0) {
                                    long j4 = currentTimeMillis - this.lastInboundActivity;
                                    long j5 = this.keepAlive;
                                    obj = obj2;
                                    if (j4 >= 100 + j5) {
                                        logger.severe(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef55"), new Object[]{new Long(j5), new Long(this.lastOutboundActivity), new Long(this.lastInboundActivity), new Long(currentTimeMillis), new Long(this.lastPing)});
                                        throw ExceptionHelper.createMqttException(32000);
                                    }
                                } else {
                                    obj = obj2;
                                }
                                if (i4 == 0) {
                                    long j6 = currentTimeMillis - this.lastOutboundActivity;
                                    long j7 = this.keepAlive;
                                    if (j6 >= 2 * j7) {
                                        logger.severe(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef56"), new Object[]{new Long(j7), new Long(this.lastOutboundActivity), new Long(this.lastInboundActivity), new Long(currentTimeMillis), new Long(this.lastPing)});
                                        throw ExceptionHelper.createMqttException(32002);
                                    }
                                }
                                if ((i4 != 0 || currentTimeMillis - this.lastInboundActivity < this.keepAlive - 100) && currentTimeMillis - this.lastOutboundActivity < this.keepAlive - 100) {
                                    mqttToken = null;
                                    logger.fine(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef58"), null);
                                    max = Math.max(1L, getKeepAlive() - (currentTimeMillis - this.lastOutboundActivity));
                                } else {
                                    logger.fine(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef57"), new Object[]{new Long(this.keepAlive), new Long(this.lastOutboundActivity), new Long(this.lastInboundActivity)});
                                    mqttToken = new MqttToken(this.clientComms.getClient().getClientId());
                                    if (iMqttActionListener != null) {
                                        mqttToken.setActionCallback(iMqttActionListener);
                                    }
                                    this.tokenStore.saveToken(mqttToken, this.pingCommand);
                                    this.pendingFlows.insertElementAt(this.pingCommand, 0);
                                    max = getKeepAlive();
                                    notifyQueueLock();
                                }
                                logger.fine(str, ProtectedSandApp.s("\uef53"), ProtectedSandApp.s("\uef59"), new Object[]{new Long(max)});
                                this.pingSender.schedule(max);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    throw th;
                }
                return mqttToken;
            } finally {
            }
        }
    }

    protected boolean checkQuiesceLock() {
        int count = this.tokenStore.count();
        if (!this.quiescing || count != 0 || this.pendingFlows.size() != 0 || !this.callback.isQuiesced()) {
            return false;
        }
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef5a"), ProtectedSandApp.s("\uef5b"), new Object[]{new Boolean(this.quiescing), new Integer(this.actualInFlight), new Integer(this.pendingFlows.size()), new Integer(this.inFlightPubRels), Boolean.valueOf(this.callback.isQuiesced()), new Integer(count)});
        synchronized (this.quiesceLock) {
            this.quiesceLock.notifyAll();
        }
        return true;
    }

    protected void clearState() throws MqttException {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef5c"), ProtectedSandApp.s("\uef5d"));
        this.persistence.clear();
        this.inUseMsgIds.clear();
        this.pendingMessages.clear();
        this.pendingFlows.clear();
        this.outboundQoS2.clear();
        this.outboundQoS1.clear();
        this.outboundQoS0.clear();
        this.inboundQoS2.clear();
        this.tokenStore.clear();
    }

    protected void close() {
        this.inUseMsgIds.clear();
        if (this.pendingMessages != null) {
            this.pendingMessages.clear();
        }
        this.pendingFlows.clear();
        this.outboundQoS2.clear();
        this.outboundQoS1.clear();
        this.outboundQoS0.clear();
        this.inboundQoS2.clear();
        this.tokenStore.clear();
        this.inUseMsgIds = null;
        this.pendingMessages = null;
        this.pendingFlows = null;
        this.outboundQoS2 = null;
        this.outboundQoS1 = null;
        this.outboundQoS0 = null;
        this.inboundQoS2 = null;
        this.tokenStore = null;
        this.callback = null;
        this.clientComms = null;
        this.persistence = null;
        this.pingCommand = null;
    }

    public void connected() {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef5e"), ProtectedSandApp.s("\uef5f"));
        this.connected = true;
        this.pingSender.start();
    }

    protected void deliveryComplete(MqttPublish mqttPublish) throws MqttPersistenceException {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef60"), ProtectedSandApp.s("\uef61"), new Object[]{new Integer(mqttPublish.getMessageId())});
        this.persistence.remove(getReceivedPersistenceKey(mqttPublish));
        this.inboundQoS2.remove(new Integer(mqttPublish.getMessageId()));
    }

    public void disconnected(MqttException mqttException) {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef62"), ProtectedSandApp.s("\uef63"), new Object[]{mqttException});
        this.connected = false;
        try {
            if (this.cleanSession) {
                clearState();
            }
            this.pendingMessages.clear();
            this.pendingFlows.clear();
            synchronized (this.pingOutstandingLock) {
                this.pingOutstanding = 0;
            }
        } catch (MqttException unused) {
        }
    }

    protected MqttWireMessage get() throws MqttException {
        synchronized (this.queueLock) {
            MqttWireMessage mqttWireMessage = null;
            while (mqttWireMessage == null) {
                try {
                    if ((this.pendingMessages.isEmpty() && this.pendingFlows.isEmpty()) || (this.pendingFlows.isEmpty() && this.actualInFlight >= this.maxInflight)) {
                        try {
                            Logger logger = log;
                            String str = CLASS_NAME;
                            logger.fine(str, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef65"));
                            this.queueLock.wait();
                            logger.fine(str, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef66"));
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (!this.connected && (this.pendingFlows.isEmpty() || !(((MqttWireMessage) this.pendingFlows.elementAt(0)) instanceof MqttConnect))) {
                        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef67"));
                        return null;
                    }
                    if (!this.pendingFlows.isEmpty()) {
                        mqttWireMessage = (MqttWireMessage) this.pendingFlows.remove(0);
                        if (mqttWireMessage instanceof MqttPubRel) {
                            int i4 = this.inFlightPubRels + 1;
                            this.inFlightPubRels = i4;
                            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef68"), new Object[]{new Integer(i4)});
                        }
                        checkQuiesceLock();
                    } else if (!this.pendingMessages.isEmpty()) {
                        if (this.actualInFlight < this.maxInflight) {
                            mqttWireMessage = (MqttWireMessage) this.pendingMessages.elementAt(0);
                            this.pendingMessages.removeElementAt(0);
                            int i5 = this.actualInFlight + 1;
                            this.actualInFlight = i5;
                            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef69"), new Object[]{new Integer(i5)});
                        } else {
                            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef64"), ProtectedSandApp.s("\uef6a"));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return mqttWireMessage;
        }
    }

    public int getActualInFlight() {
        return this.actualInFlight;
    }

    protected boolean getCleanSession() {
        return this.cleanSession;
    }

    public Properties getDebug() {
        Properties properties = new Properties();
        properties.put(ProtectedSandApp.s("\uef6b"), this.inUseMsgIds);
        properties.put(ProtectedSandApp.s("\uef6c"), this.pendingMessages);
        properties.put(ProtectedSandApp.s("\uef6d"), this.pendingFlows);
        properties.put(ProtectedSandApp.s("\uef6e"), new Integer(this.maxInflight));
        properties.put(ProtectedSandApp.s("\uef6f"), new Integer(this.nextMsgId));
        properties.put(ProtectedSandApp.s("\uef70"), new Integer(this.actualInFlight));
        properties.put(ProtectedSandApp.s("\uef71"), new Integer(this.inFlightPubRels));
        properties.put(ProtectedSandApp.s("\uef72"), Boolean.valueOf(this.quiescing));
        properties.put(ProtectedSandApp.s("\uef73"), new Integer(this.pingOutstanding));
        properties.put(ProtectedSandApp.s("\uef74"), new Long(this.lastOutboundActivity));
        properties.put(ProtectedSandApp.s("\uef75"), new Long(this.lastInboundActivity));
        properties.put(ProtectedSandApp.s("\uef76"), this.outboundQoS2);
        properties.put(ProtectedSandApp.s("\uef77"), this.outboundQoS1);
        properties.put(ProtectedSandApp.s("\uef78"), this.outboundQoS0);
        properties.put(ProtectedSandApp.s("\uef79"), this.inboundQoS2);
        properties.put(ProtectedSandApp.s("\uef7a"), this.tokenStore);
        return properties;
    }

    protected long getKeepAlive() {
        return this.keepAlive;
    }

    public int getMaxInFlight() {
        return this.maxInflight;
    }

    protected void notifyComplete(MqttToken mqttToken) throws MqttException {
        MqttWireMessage wireMessage = mqttToken.internalTok.getWireMessage();
        if (wireMessage == null || !(wireMessage instanceof MqttAck)) {
            return;
        }
        Logger logger = log;
        String str = CLASS_NAME;
        Object[] objArr = {new Integer(wireMessage.getMessageId()), mqttToken, wireMessage};
        String s4 = ProtectedSandApp.s("\uef7b");
        logger.fine(str, s4, ProtectedSandApp.s("\uef7c"), objArr);
        MqttAck mqttAck = (MqttAck) wireMessage;
        if (mqttAck instanceof MqttPubAck) {
            this.persistence.remove(getSendPersistenceKey(wireMessage));
            this.persistence.remove(getSendBufferedPersistenceKey(wireMessage));
            this.outboundQoS1.remove(new Integer(mqttAck.getMessageId()));
            decrementInFlight();
            releaseMessageId(wireMessage.getMessageId());
            this.tokenStore.removeToken(wireMessage);
            logger.fine(str, s4, ProtectedSandApp.s("\uef7d"), new Object[]{new Integer(mqttAck.getMessageId())});
        } else if (mqttAck instanceof MqttPubComp) {
            this.persistence.remove(getSendPersistenceKey(wireMessage));
            this.persistence.remove(getSendConfirmPersistenceKey(wireMessage));
            this.persistence.remove(getSendBufferedPersistenceKey(wireMessage));
            this.outboundQoS2.remove(new Integer(mqttAck.getMessageId()));
            this.inFlightPubRels--;
            decrementInFlight();
            releaseMessageId(wireMessage.getMessageId());
            this.tokenStore.removeToken(wireMessage);
            logger.fine(str, s4, ProtectedSandApp.s("\uef7e"), new Object[]{new Integer(mqttAck.getMessageId()), new Integer(this.inFlightPubRels)});
        }
        checkQuiesceLock();
    }

    public void notifyQueueLock() {
        synchronized (this.queueLock) {
            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef7f"), ProtectedSandApp.s("\uef80"));
            this.queueLock.notifyAll();
        }
    }

    protected void notifyReceivedAck(MqttAck mqttAck) throws MqttException {
        this.lastInboundActivity = System.currentTimeMillis();
        Logger logger = log;
        String str = CLASS_NAME;
        logger.fine(str, ProtectedSandApp.s("\uef81"), ProtectedSandApp.s("\uef82"), new Object[]{new Integer(mqttAck.getMessageId()), mqttAck});
        MqttToken token = this.tokenStore.getToken(mqttAck);
        if (token == null) {
            logger.fine(str, ProtectedSandApp.s("\uef81"), ProtectedSandApp.s("\uef83"), new Object[]{new Integer(mqttAck.getMessageId())});
        } else if (mqttAck instanceof MqttPubRec) {
            send(new MqttPubRel((MqttPubRec) mqttAck), token);
        } else if ((mqttAck instanceof MqttPubAck) || (mqttAck instanceof MqttPubComp)) {
            notifyResult(mqttAck, token, null);
        } else if (mqttAck instanceof MqttPingResp) {
            synchronized (this.pingOutstandingLock) {
                try {
                    this.pingOutstanding = Math.max(0, this.pingOutstanding - 1);
                    notifyResult(mqttAck, token, null);
                    if (this.pingOutstanding == 0) {
                        this.tokenStore.removeToken(mqttAck);
                    }
                } finally {
                }
            }
            logger.fine(str, ProtectedSandApp.s("\uef81"), ProtectedSandApp.s("\uef84"), new Object[]{new Integer(this.pingOutstanding)});
        } else if (mqttAck instanceof MqttConnack) {
            MqttConnack mqttConnack = (MqttConnack) mqttAck;
            int returnCode = mqttConnack.getReturnCode();
            if (returnCode != 0) {
                throw ExceptionHelper.createMqttException(returnCode);
            }
            synchronized (this.queueLock) {
                try {
                    if (this.cleanSession) {
                        clearState();
                        this.tokenStore.saveToken(token, mqttAck);
                    }
                    this.inFlightPubRels = 0;
                    this.actualInFlight = 0;
                    restoreInflightMessages();
                    connected();
                } finally {
                }
            }
            this.clientComms.connectComplete(mqttConnack, null);
            notifyResult(mqttAck, token, null);
            this.tokenStore.removeToken(mqttAck);
            synchronized (this.queueLock) {
                this.queueLock.notifyAll();
            }
        } else {
            notifyResult(mqttAck, token, null);
            releaseMessageId(mqttAck.getMessageId());
            this.tokenStore.removeToken(mqttAck);
        }
        checkQuiesceLock();
    }

    public void notifyReceivedBytes(int i4) {
        if (i4 > 0) {
            this.lastInboundActivity = System.currentTimeMillis();
        }
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef85"), ProtectedSandApp.s("\uef86"), new Object[]{new Integer(i4)});
    }

    protected void notifyReceivedMsg(MqttWireMessage mqttWireMessage) throws MqttException {
        this.lastInboundActivity = System.currentTimeMillis();
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef87"), ProtectedSandApp.s("\uef88"), new Object[]{new Integer(mqttWireMessage.getMessageId()), mqttWireMessage});
        if (this.quiescing) {
            return;
        }
        if (!(mqttWireMessage instanceof MqttPublish)) {
            if (mqttWireMessage instanceof MqttPubRel) {
                MqttPublish mqttPublish = (MqttPublish) this.inboundQoS2.get(new Integer(mqttWireMessage.getMessageId()));
                if (mqttPublish == null) {
                    send(new MqttPubComp(mqttWireMessage.getMessageId()), null);
                    return;
                }
                CommsCallback commsCallback = this.callback;
                if (commsCallback != null) {
                    commsCallback.messageArrived(mqttPublish);
                    return;
                }
                return;
            }
            return;
        }
        MqttPublish mqttPublish2 = (MqttPublish) mqttWireMessage;
        int qos = mqttPublish2.getMessage().getQos();
        if (qos == 0 || qos == 1) {
            CommsCallback commsCallback2 = this.callback;
            if (commsCallback2 != null) {
                commsCallback2.messageArrived(mqttPublish2);
                return;
            }
            return;
        }
        if (qos != 2) {
            return;
        }
        this.persistence.put(getReceivedPersistenceKey(mqttWireMessage), mqttPublish2);
        this.inboundQoS2.put(new Integer(mqttPublish2.getMessageId()), mqttPublish2);
        send(new MqttPubRec(mqttPublish2), null);
    }

    protected void notifyResult(MqttWireMessage mqttWireMessage, MqttToken mqttToken, MqttException mqttException) {
        mqttToken.internalTok.markComplete(mqttWireMessage, mqttException);
        mqttToken.internalTok.notifyComplete();
        String s4 = ProtectedSandApp.s("\uef89");
        if (mqttWireMessage != null && (mqttWireMessage instanceof MqttAck) && !(mqttWireMessage instanceof MqttPubRec)) {
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef8a"), new Object[]{mqttToken.internalTok.getKey(), mqttWireMessage, mqttException});
            this.callback.asyncOperationComplete(mqttToken);
        }
        if (mqttWireMessage == null) {
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uef8b"), new Object[]{mqttToken.internalTok.getKey(), mqttException});
            this.callback.asyncOperationComplete(mqttToken);
        }
    }

    protected void notifySent(MqttWireMessage mqttWireMessage) {
        int i4;
        this.lastOutboundActivity = System.currentTimeMillis();
        Logger logger = log;
        String str = CLASS_NAME;
        logger.fine(str, ProtectedSandApp.s("\uef8c"), ProtectedSandApp.s("\uef8d"), new Object[]{mqttWireMessage.getKey()});
        MqttToken token = this.tokenStore.getToken(mqttWireMessage);
        token.internalTok.notifySent();
        if (mqttWireMessage instanceof MqttPingReq) {
            synchronized (this.pingOutstandingLock) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.pingOutstandingLock) {
                    this.lastPing = currentTimeMillis;
                    i4 = this.pingOutstanding + 1;
                    this.pingOutstanding = i4;
                }
                logger.fine(str, ProtectedSandApp.s("\uef8c"), ProtectedSandApp.s("\uef8e"), new Object[]{new Integer(i4)});
            }
            return;
        }
        if ((mqttWireMessage instanceof MqttPublish) && ((MqttPublish) mqttWireMessage).getMessage().getQos() == 0) {
            token.internalTok.markComplete(null, null);
            this.callback.asyncOperationComplete(token);
            decrementInFlight();
            releaseMessageId(mqttWireMessage.getMessageId());
            this.tokenStore.removeToken(mqttWireMessage);
            checkQuiesceLock();
        }
    }

    public void notifySentBytes(int i4) {
        if (i4 > 0) {
            this.lastOutboundActivity = System.currentTimeMillis();
        }
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef8f"), ProtectedSandApp.s("\uef90"), new Object[]{new Integer(i4)});
    }

    public void persistBufferedMessage(MqttWireMessage mqttWireMessage) {
        String s4 = ProtectedSandApp.s("\uef91");
        String s5 = ProtectedSandApp.s("\uef92");
        String sendBufferedPersistenceKey = getSendBufferedPersistenceKey(mqttWireMessage);
        try {
            mqttWireMessage.setMessageId(getNextMessageId());
            String sendBufferedPersistenceKey2 = getSendBufferedPersistenceKey(mqttWireMessage);
            try {
                this.persistence.put(sendBufferedPersistenceKey2, (MqttPublish) mqttWireMessage);
            } catch (MqttPersistenceException unused) {
                log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uef93"));
                this.persistence.open(this.clientComms.getClient().getClientId(), this.clientComms.getClient().getServerURI());
                this.persistence.put(sendBufferedPersistenceKey2, (MqttPublish) mqttWireMessage);
            }
            log.fine(CLASS_NAME, s5, s4, new Object[]{sendBufferedPersistenceKey2});
        } catch (MqttException unused2) {
            log.warning(CLASS_NAME, s5, s4, new Object[]{sendBufferedPersistenceKey});
        }
    }

    public void quiesce(long j4) {
        int count;
        if (j4 > 0) {
            Logger logger = log;
            String str = CLASS_NAME;
            logger.fine(str, ProtectedSandApp.s("\uef94"), ProtectedSandApp.s("\uef95"), new Object[]{new Long(j4)});
            synchronized (this.queueLock) {
                this.quiescing = true;
            }
            this.callback.quiesce();
            notifyQueueLock();
            synchronized (this.quiesceLock) {
                try {
                    try {
                        count = this.tokenStore.count();
                    } catch (InterruptedException unused) {
                    }
                    if (count <= 0) {
                        if (this.pendingFlows.size() <= 0) {
                            if (!this.callback.isQuiesced()) {
                            }
                        }
                    }
                    logger.fine(str, ProtectedSandApp.s("\uef94"), ProtectedSandApp.s("\uef96"), new Object[]{new Integer(this.actualInFlight), new Integer(this.pendingFlows.size()), new Integer(this.inFlightPubRels), new Integer(count)});
                    this.quiesceLock.wait(j4);
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (this.queueLock) {
                this.pendingMessages.clear();
                this.pendingFlows.clear();
                this.quiescing = false;
                this.actualInFlight = 0;
            }
            log.fine(CLASS_NAME, ProtectedSandApp.s("\uef94"), ProtectedSandApp.s("\uef97"));
        }
    }

    public Vector resolveOldTokens(MqttException mqttException) {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef98"), ProtectedSandApp.s("\uef99"), new Object[]{mqttException});
        if (mqttException == null) {
            mqttException = new MqttException(32102);
        }
        Vector outstandingTokens = this.tokenStore.getOutstandingTokens();
        Enumeration elements = outstandingTokens.elements();
        while (elements.hasMoreElements()) {
            MqttToken mqttToken = (MqttToken) elements.nextElement();
            synchronized (mqttToken) {
                try {
                    if (!mqttToken.isComplete() && !mqttToken.internalTok.isCompletePending() && mqttToken.getException() == null) {
                        mqttToken.internalTok.setException(mqttException);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!(mqttToken instanceof MqttDeliveryToken)) {
                this.tokenStore.removeToken(mqttToken.internalTok.getKey());
            }
        }
        return outstandingTokens;
    }

    protected void restoreState() throws MqttException {
        Enumeration keys = this.persistence.keys();
        int i4 = this.nextMsgId;
        Vector vector = new Vector();
        Logger logger = log;
        String str = CLASS_NAME;
        String s4 = ProtectedSandApp.s("\uef9a");
        String s5 = ProtectedSandApp.s("\uef9b");
        logger.fine(str, s5, s4);
        while (keys.hasMoreElements()) {
            String str2 = (String) keys.nextElement();
            MqttWireMessage restoreMessage = restoreMessage(str2, this.persistence.get(str2));
            if (restoreMessage != null) {
                if (str2.startsWith(ProtectedSandApp.s("\uef45"))) {
                    log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uef9d"), new Object[]{str2, restoreMessage});
                    this.inboundQoS2.put(new Integer(restoreMessage.getMessageId()), restoreMessage);
                } else {
                    boolean startsWith = str2.startsWith(ProtectedSandApp.s("\uef42"));
                    String s6 = ProtectedSandApp.s("\uef9e");
                    String s7 = ProtectedSandApp.s("\uef9f");
                    if (startsWith) {
                        MqttPublish mqttPublish = (MqttPublish) restoreMessage;
                        i4 = Math.max(mqttPublish.getMessageId(), i4);
                        if (this.persistence.containsKey(getSendConfirmPersistenceKey(mqttPublish))) {
                            MqttPubRel mqttPubRel = (MqttPubRel) restoreMessage(str2, this.persistence.get(getSendConfirmPersistenceKey(mqttPublish)));
                            if (mqttPubRel != null) {
                                log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uefa0"), new Object[]{str2, restoreMessage});
                                this.outboundQoS2.put(new Integer(mqttPubRel.getMessageId()), mqttPubRel);
                            } else {
                                log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uefa1"), new Object[]{str2, restoreMessage});
                            }
                        } else {
                            mqttPublish.setDuplicate(true);
                            if (mqttPublish.getMessage().getQos() == 2) {
                                log.fine(CLASS_NAME, s5, s7, new Object[]{str2, restoreMessage});
                                this.outboundQoS2.put(new Integer(mqttPublish.getMessageId()), mqttPublish);
                            } else {
                                log.fine(CLASS_NAME, s5, s6, new Object[]{str2, restoreMessage});
                                this.outboundQoS1.put(new Integer(mqttPublish.getMessageId()), mqttPublish);
                            }
                        }
                        this.tokenStore.restoreToken(mqttPublish).internalTok.setClient(this.clientComms.getClient());
                        this.inUseMsgIds.put(new Integer(mqttPublish.getMessageId()), new Integer(mqttPublish.getMessageId()));
                    } else if (str2.startsWith(ProtectedSandApp.s("\uef43"))) {
                        MqttPublish mqttPublish2 = (MqttPublish) restoreMessage;
                        i4 = Math.max(mqttPublish2.getMessageId(), i4);
                        if (mqttPublish2.getMessage().getQos() == 2) {
                            log.fine(CLASS_NAME, s5, s7, new Object[]{str2, restoreMessage});
                            this.outboundQoS2.put(new Integer(mqttPublish2.getMessageId()), mqttPublish2);
                        } else if (mqttPublish2.getMessage().getQos() == 1) {
                            log.fine(CLASS_NAME, s5, s6, new Object[]{str2, restoreMessage});
                            this.outboundQoS1.put(new Integer(mqttPublish2.getMessageId()), mqttPublish2);
                        } else {
                            log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uefa2"), new Object[]{str2, restoreMessage});
                            this.outboundQoS0.put(new Integer(mqttPublish2.getMessageId()), mqttPublish2);
                            this.persistence.remove(str2);
                        }
                        this.tokenStore.restoreToken(mqttPublish2).internalTok.setClient(this.clientComms.getClient());
                        this.inUseMsgIds.put(new Integer(mqttPublish2.getMessageId()), new Integer(mqttPublish2.getMessageId()));
                    } else if (str2.startsWith(ProtectedSandApp.s("\uef44")) && !this.persistence.containsKey(getSendPersistenceKey((MqttPubRel) restoreMessage))) {
                        vector.addElement(str2);
                    }
                }
            }
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            String str3 = (String) elements.nextElement();
            log.fine(CLASS_NAME, s5, ProtectedSandApp.s("\uef9c"), new Object[]{str3});
            this.persistence.remove(str3);
        }
        this.nextMsgId = i4;
    }

    public void send(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
        if (mqttWireMessage.isMessageIdRequired() && mqttWireMessage.getMessageId() == 0) {
            if ((mqttWireMessage instanceof MqttPublish) && ((MqttPublish) mqttWireMessage).getMessage().getQos() != 0) {
                mqttWireMessage.setMessageId(getNextMessageId());
            } else if ((mqttWireMessage instanceof MqttPubAck) || (mqttWireMessage instanceof MqttPubRec) || (mqttWireMessage instanceof MqttPubRel) || (mqttWireMessage instanceof MqttPubComp) || (mqttWireMessage instanceof MqttSubscribe) || (mqttWireMessage instanceof MqttSuback) || (mqttWireMessage instanceof MqttUnsubscribe) || (mqttWireMessage instanceof MqttUnsubAck)) {
                mqttWireMessage.setMessageId(getNextMessageId());
            }
        }
        if (mqttToken != null) {
            try {
                mqttToken.internalTok.setMessageID(mqttWireMessage.getMessageId());
            } catch (Exception unused) {
            }
        }
        if (mqttWireMessage instanceof MqttPublish) {
            synchronized (this.queueLock) {
                try {
                    int i4 = this.actualInFlight;
                    if (i4 >= this.maxInflight) {
                        log.fine(CLASS_NAME, ProtectedSandApp.s("\uefa3"), ProtectedSandApp.s("\uefa5"), new Object[]{new Integer(i4)});
                        throw new MqttException(32202);
                    }
                    MqttMessage message = ((MqttPublish) mqttWireMessage).getMessage();
                    log.fine(CLASS_NAME, ProtectedSandApp.s("\uefa3"), ProtectedSandApp.s("\uefa4"), new Object[]{new Integer(mqttWireMessage.getMessageId()), new Integer(message.getQos()), mqttWireMessage});
                    int qos = message.getQos();
                    if (qos == 1) {
                        this.outboundQoS1.put(new Integer(mqttWireMessage.getMessageId()), mqttWireMessage);
                        this.persistence.put(getSendPersistenceKey(mqttWireMessage), (MqttPublish) mqttWireMessage);
                    } else if (qos == 2) {
                        this.outboundQoS2.put(new Integer(mqttWireMessage.getMessageId()), mqttWireMessage);
                        this.persistence.put(getSendPersistenceKey(mqttWireMessage), (MqttPublish) mqttWireMessage);
                    }
                    this.tokenStore.saveToken(mqttToken, mqttWireMessage);
                    this.pendingMessages.addElement(mqttWireMessage);
                    this.queueLock.notifyAll();
                } finally {
                }
            }
            return;
        }
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uefa3"), ProtectedSandApp.s("\uefa6"), new Object[]{new Integer(mqttWireMessage.getMessageId()), mqttWireMessage});
        if (mqttWireMessage instanceof MqttConnect) {
            synchronized (this.queueLock) {
                this.tokenStore.saveToken(mqttToken, mqttWireMessage);
                this.pendingFlows.insertElementAt(mqttWireMessage, 0);
                this.queueLock.notifyAll();
            }
            return;
        }
        if (mqttWireMessage instanceof MqttPingReq) {
            this.pingCommand = mqttWireMessage;
        } else if (mqttWireMessage instanceof MqttPubRel) {
            this.outboundQoS2.put(new Integer(mqttWireMessage.getMessageId()), mqttWireMessage);
            this.persistence.put(getSendConfirmPersistenceKey(mqttWireMessage), (MqttPubRel) mqttWireMessage);
        } else if (mqttWireMessage instanceof MqttPubComp) {
            this.persistence.remove(getReceivedPersistenceKey(mqttWireMessage));
        }
        synchronized (this.queueLock) {
            try {
                if (!(mqttWireMessage instanceof MqttAck)) {
                    this.tokenStore.saveToken(mqttToken, mqttWireMessage);
                }
                this.pendingFlows.addElement(mqttWireMessage);
                this.queueLock.notifyAll();
            } finally {
            }
        }
    }

    protected void setCleanSession(boolean z4) {
        this.cleanSession = z4;
    }

    public void setKeepAliveInterval(long j4) {
        this.keepAlive = j4;
    }

    protected void setKeepAliveSecs(long j4) {
        this.keepAlive = j4 * 1000;
    }

    protected void setMaxInflight(int i4) {
        this.maxInflight = i4;
        this.pendingMessages = new Vector(this.maxInflight);
    }

    public void unPersistBufferedMessage(MqttWireMessage mqttWireMessage) {
        String s4 = ProtectedSandApp.s("\uefa7");
        try {
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uefa8"), new Object[]{mqttWireMessage.getKey()});
            this.persistence.remove(getSendBufferedPersistenceKey(mqttWireMessage));
        } catch (MqttPersistenceException unused) {
            log.fine(CLASS_NAME, s4, ProtectedSandApp.s("\uefa9"), new Object[]{mqttWireMessage.getKey()});
        }
    }

    protected void undo(MqttPublish mqttPublish) throws MqttPersistenceException {
        synchronized (this.queueLock) {
            try {
                log.fine(CLASS_NAME, ProtectedSandApp.s("\uefaa"), ProtectedSandApp.s("\uefab"), new Object[]{new Integer(mqttPublish.getMessageId()), new Integer(mqttPublish.getMessage().getQos())});
                if (mqttPublish.getMessage().getQos() == 1) {
                    this.outboundQoS1.remove(new Integer(mqttPublish.getMessageId()));
                } else {
                    this.outboundQoS2.remove(new Integer(mqttPublish.getMessageId()));
                }
                this.pendingMessages.removeElement(mqttPublish);
                this.persistence.remove(getSendPersistenceKey(mqttPublish));
                this.tokenStore.removeToken(mqttPublish);
                if (mqttPublish.getMessage().getQos() > 0) {
                    releaseMessageId(mqttPublish.getMessageId());
                    mqttPublish.setMessageId(0);
                }
                checkQuiesceLock();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String getReceivedPersistenceKey(int i4) {
        return a.a(ProtectedSandApp.s("\uef45"), i4);
    }

    protected void deliveryComplete(int i4) throws MqttPersistenceException {
        log.fine(CLASS_NAME, ProtectedSandApp.s("\uef60"), ProtectedSandApp.s("\uef61"), new Object[]{new Integer(i4)});
        this.persistence.remove(getReceivedPersistenceKey(i4));
        this.inboundQoS2.remove(new Integer(i4));
    }
}
