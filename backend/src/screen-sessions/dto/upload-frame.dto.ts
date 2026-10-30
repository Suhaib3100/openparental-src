import { IsString, MaxLength } from 'class-validator';

/** Base64 JPEG from device (accessibility capture). */
export class UploadFrameDto {
  @IsString()
  @MaxLength(500_000)
  data!: string;
}
