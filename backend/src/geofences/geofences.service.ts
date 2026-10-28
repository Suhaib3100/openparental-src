import { Injectable, NotFoundException } from '@nestjs/common';
import { Geofence } from '@prisma/client';
import { AlertsService } from '../alerts/alerts.service';
import { DevicesService } from '../devices/devices.service';
import { PrismaService } from '../prisma/prisma.service';
import { CreateGeofenceDto } from './dto/create-geofence.dto';
import { GeofenceTransitionDto } from './dto/geofence-transition.dto';

@Injectable()
export class GeofencesService {
  constructor(
    private readonly prisma: PrismaService,
    private readonly devices: DevicesService,
    private readonly alerts: AlertsService,
  ) {}

  async listForDevice(deviceId: string): Promise<Geofence[]> {
    return this.prisma.geofence.findMany({
      where: { deviceId, active: true },
      orderBy: { createdAt: 'desc' },
    });
  }

  async listForParent(familyId: string, deviceId: string): Promise<Geofence[]> {
    await this.devices.getForFamily(familyId, deviceId);
    return this.prisma.geofence.findMany({
      where: { deviceId },
      orderBy: { createdAt: 'desc' },
    });
  }

  async create(
    familyId: string,
    deviceId: string,
    dto: CreateGeofenceDto,
  ): Promise<Geofence> {
    const device = await this.devices.getForFamily(familyId, deviceId);
    return this.prisma.geofence.create({
      data: {
        deviceId: device.id,
        name: dto.name.trim() || 'Place',
        lat: dto.lat,
        lng: dto.lng,
        radiusM: dto.radiusM ?? 200,
      },
    });
  }

  async remove(familyId: string, deviceId: string, id: string): Promise<void> {
    await this.devices.getForFamily(familyId, deviceId);
    const row = await this.prisma.geofence.findFirst({
      where: { id, deviceId },
    });
    if (!row) throw new NotFoundException('geofence not found');
    await this.prisma.geofence.update({
      where: { id },
      data: { active: false },
    });
  }

  async reportTransition(
    deviceId: string,
    familyId: string,
    dto: GeofenceTransitionDto,
  ): Promise<void> {
    const fence = await this.prisma.geofence.findFirst({
      where: { id: dto.geofenceId, deviceId, active: true },
    });
    if (!fence) return;

    const verb = dto.transition === 'ENTER' ? 'entered' : 'left';
    await this.alerts.create({
      familyId,
      deviceId,
      type: 'GEOFENCE',
      title: `Geofence: ${fence.name}`,
      body: `Device ${verb} "${fence.name}"`,
      data: {
        geofenceId: fence.id,
        transition: dto.transition,
        lat: fence.lat,
        lng: fence.lng,
      },
    });
  }
}
