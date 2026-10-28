import { IsNumber, IsOptional, IsString, Max, Min } from 'class-validator';

export class CreateGeofenceDto {
  @IsString()
  name!: string;

  @IsNumber()
  @Min(-90)
  @Max(90)
  lat!: number;

  @IsNumber()
  @Min(-180)
  @Max(180)
  lng!: number;

  @IsOptional()
  @IsNumber()
  @Min(50)
  @Max(50000)
  radiusM?: number;
}
