import {
  Body,
  Controller,
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
import { ConsentSessionDto } from './dto/consent-session.dto';
import { ScreenSessionsService } from './screen-sessions.service';

@Controller()
export class ScreenSessionsController {
  constructor(private readonly sessions: ScreenSessionsService) {}

  // ---- parent ----

  @Post('devices/:deviceId/screen-sessions')
  @HttpCode(HttpStatus.CREATED)
  @UseGuards(JwtAuthGuard)
  create(
    @CurrentUser() user: AuthUser,
    @Param('deviceId') deviceId: string,
  ) {
    return this.sessions.create(user.familyId, deviceId, user.userId);
  }

  @Get('screen-sessions/:id')
  @UseGuards(JwtAuthGuard)
  get(@CurrentUser() user: AuthUser, @Param('id') id: string) {
    return this.sessions.getForFamily(user.familyId, id);
  }

  @Post('screen-sessions/:id/end')
  @HttpCode(HttpStatus.OK)
  @UseGuards(JwtAuthGuard)
  endAsParent(@CurrentUser() user: AuthUser, @Param('id') id: string) {
    return this.sessions.endAsParent(user.familyId, id, user.userId);
  }

  // ---- device ----

  @Post('screen-sessions/:id/consent')
  @HttpCode(HttpStatus.OK)
  @UseGuards(DeviceAuthGuard)
  consent(
    @CurrentDevice() device: AuthDevice,
    @Param('id') id: string,
    @Body() dto: ConsentSessionDto,
  ) {
    return this.sessions.consent(device.deviceId, id, dto.approved);
  }

  @Post('screen-sessions/:id/stop')
  @HttpCode(HttpStatus.OK)
  @UseGuards(DeviceAuthGuard)
  endAsDevice(@CurrentDevice() device: AuthDevice, @Param('id') id: string) {
    return this.sessions.endAsDevice(device.deviceId, id);
  }
}
