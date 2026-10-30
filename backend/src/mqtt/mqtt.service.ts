import {
  Injectable,
  Logger,
  OnModuleDestroy,
  OnModuleInit,
} from '@nestjs/common';
import { ConfigService } from '@nestjs/config';
import { connect, type MqttClient } from 'mqtt';

/**
 * Instant command delivery over MQTT — the persistent realtime spine (parallel
 * to FCM). When a command is enqueued we publish a small wake message to the
 * device's topic; the device, holding a live MQTT connection, pulls and executes
 * immediately instead of waiting for the next poll.
 *
 * Disabled (no-op) unless MQTT_URL is set, exactly like FCM.
 */
@Injectable()
export class MqttService implements OnModuleInit, OnModuleDestroy {
  private readonly logger = new Logger(MqttService.name);
  private client?: MqttClient;
  private ready = false;

  constructor(private readonly config: ConfigService) {}

  onModuleInit(): void {
    const url = this.config.get<string>('mqtt.url');
    if (!url) {
      this.logger.log('MQTT_URL not set — MQTT wake disabled');
      return;
    }
    const username = this.config.get<string>('mqtt.username') || undefined;
    const password = this.config.get<string>('mqtt.password') || undefined;
    this.client = connect(url, {
      username,
      password,
      reconnectPeriod: 5000,
      clientId: `openparental-backend-${Math.random().toString(16).slice(2, 10)}`,
    });
    this.client.on('connect', () => {
      this.ready = true;
      this.logger.log(`MQTT connected: ${url}`);
    });
    this.client.on('error', (e) => this.logger.warn(`MQTT error: ${e.message}`));
    this.client.on('close', () => {
      this.ready = false;
    });
  }

  onModuleDestroy(): void {
    this.client?.end(true);
  }

  /** Topic a device subscribes to for its command wakes. */
  static deviceTopic(deviceId: string): string {
    return `openparental/device/${deviceId}/cmd`;
  }

  /**
   * Publish a command wake. Returns true if handed to the broker. The payload is
   * intentionally thin — the device pulls the real command over the idempotent
   * REST spine, so a lost/duplicate publish is harmless.
   */
  publishCommand(deviceId: string, commandId: string, type: string): boolean {
    if (!this.client || !this.ready) return false;
    const topic = MqttService.deviceTopic(deviceId);
    const payload = JSON.stringify({ kind: 'command', commandId, type });
    this.client.publish(topic, payload, { qos: 1 });
    return true;
  }
}
