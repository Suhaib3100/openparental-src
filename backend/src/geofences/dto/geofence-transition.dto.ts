import { IsIn, IsString } from 'class-validator';

export class GeofenceTransitionDto {
  @IsString()
  geofenceId!: string;

  @IsIn(['ENTER', 'EXIT'])
  transition!: 'ENTER' | 'EXIT';
}
