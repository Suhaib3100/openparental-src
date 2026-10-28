import {
  Body,
  Controller,
  Delete,
  Get,
  HttpCode,
  HttpStatus,
  Param,
  Post,
  UseGuards,
} from '@nestjs/common';
import { CurrentDevice } from '../common/decorators/current-device.decorator';
import { CurrentUser } from '../common/decorators/current-user.decorator';
import { DeviceAuthGuard } from '../common/guards/device-auth.guard';
import { JwtAuthGuard } from '../common/guards/jwt-auth.guard';
import { AuthDevice, AuthUser } from '../common/types';
import { CreateGeofenceDto } from './dto/create-geofence.dto';
import { GeofenceTransitionDto } from './dto/geofence-transition.dto';
import { GeofencesService } from './geofences.service';

@Controller()
export class GeofencesController {
  constructor(private readonly geofences: GeofencesService) {}

  /** Child pulls active geofences on each sync loop. */
  @Get('geofences')
  @UseGuards(DeviceAuthGuard)
  listForChild(@CurrentDevice() device: AuthDevice) {
    return this.geofences.listForDevice(device.deviceId);
  }

  @Post('geofences/transitions')
  @HttpCode(HttpStatus.NO_CONTENT)
  @UseGuards(DeviceAuthGuard)
  async transition(
    @CurrentDevice() device: AuthDevice,
    @Body() dto: GeofenceTransitionDto,
  ) {
    await this.geofences.reportTransition(
      device.deviceId,
      device.familyId,
      dto,
    );
  }

  @Get('devices/:deviceId/geofences')
  @UseGuards(JwtAuthGuard)
  listForParent(
    @CurrentUser() user: AuthUser,
    @Param('deviceId') deviceId: string,
  ) {
    return this.geofences.listForParent(user.familyId, deviceId);
  }

  @Post('devices/:deviceId/geofences')
  @UseGuards(JwtAuthGuard)
  create(
    @CurrentUser() user: AuthUser,
    @Param('deviceId') deviceId: string,
    @Body() dto: CreateGeofenceDto,
  ) {
    return this.geofences.create(user.familyId, deviceId, dto);
  }

  @Delete('devices/:deviceId/geofences/:id')
  @HttpCode(HttpStatus.NO_CONTENT)
  @UseGuards(JwtAuthGuard)
  remove(
    @CurrentUser() user: AuthUser,
    @Param('deviceId') deviceId: string,
    @Param('id') id: string,
  ) {
    return this.geofences.remove(user.familyId, deviceId, id);
  }
}
