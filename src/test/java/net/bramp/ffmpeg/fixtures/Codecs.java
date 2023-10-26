package net.bramp.ffmpeg.fixtures;

import com.google.common.collect.ImmutableList;
import net.bramp.ffmpeg.info.Codec;

/**
 * Class that contains all codecs as defined in the unit tests This should not be used as a concise
 * list of available codecs, as every install of ffmpeg is different. Call ffmpeg.codec() to
 * discover.
 *
 * @author bramp
 */
public final class Codecs {

  private Codecs() {
    throw new AssertionError("No instances for you!");
  }

  public static final ImmutableList<Codec> CODECS =
      new ImmutableList.Builder<Codec>()
          .add(
              new Codec("012v", "Uncompressed 4:2:2 10-bit", "D.VI.S"),
              new Codec("4xm", "4X Movie", "D.V.L."),
              new Codec("8bps", "QuickTime 8BPS video", "D.VI.S"),
              new Codec(
                  "a64_multi",
                  "Multicolor charset for Commodore 64 (encoders: a64multi )",
                  ".EVIL."),
              new Codec(
                  "a64_multi5",
                  "Multicolor charset for Commodore 64, extended with 5th color (colram) (encoders: a64multi5 )",
                  ".EVIL."),
              new Codec("aasc", "Autodesk RLE", "D.V..S"),
              new Codec("agm", "Amuse Graphics Movie", "D.V.L."),
              new Codec("aic", "Apple Intermediate Codec", "D.VIL."),
              new Codec("alias_pix", "Alias/Wavefront PIX image", "DEVI.S"),
              new Codec("amv", "AMV Video", "DEVIL."),
              new Codec("anm", "Deluxe Paint Animation", "D.V.L."),
              new Codec("ansi", "ASCII/ANSI art", "D.V.L."),
              new Codec("apng", "APNG (Animated Portable Network Graphics) image", "DEV..S"),
              new Codec("arbc", "Gryphon's Anim Compressor", "D.V.L."),
              new Codec("asv1", "ASUS V1", "DEVIL."),
              new Codec("asv2", "ASUS V2", "DEVIL."),
              new Codec("aura", "Auravision AURA", "D.VIL."),
              new Codec("aura2", "Auravision Aura 2", "D.VIL."),
              new Codec(
                  "av1",
                  "Alliance for Open Media AV1 (decoders: libdav1d libaom-av1 ) (encoders: libaom-av1 )",
                  "DEV.L."),
              new Codec("avrn", "Avid AVI Codec", "D.V..."),
              new Codec("avrp", "Avid 1:1 10-bit RGB Packer", "DEVI.S"),
              new Codec("avs", "AVS (Audio Video Standard) video", "D.V.L."),
              new Codec("avs2", "AVS2-P2/IEEE1857.4", "..V.L."),
              new Codec("avui", "Avid Meridien Uncompressed", "DEVI.S"),
              new Codec("ayuv", "Uncompressed packed MS 4:4:4:4", "DEVI.S"),
              new Codec("bethsoftvid", "Bethesda VID video", "D.V.L."),
              new Codec("bfi", "Brute Force & Ignorance", "D.V.L."),
              new Codec("binkvideo", "Bink video", "D.V.L."),
              new Codec("bintext", "Binary text", "D.VI.."),
              new Codec("bitpacked", "Bitpacked", "D.VI.S"),
              new Codec("bmp", "BMP (Windows and OS/2 bitmap)", "DEVI.S"),
              new Codec("bmv_video", "Discworld II BMV video", "D.V..S"),
              new Codec("brender_pix", "BRender PIX image", "D.VI.S"),
              new Codec("c93", "Interplay C93", "D.V.L."),
              new Codec(
                  "cavs", "Chinese AVS (Audio Video Standard) (AVS1-P2, JiZhun profile)", "D.V.L."),
              new Codec("cdgraphics", "CD Graphics video", "D.V.L."),
              new Codec("cdxl", "Commodore CDXL video", "D.VIL."),
              new Codec("cfhd", "Cineform HD", "D.V.L."),
              new Codec("cinepak", "Cinepak", "DEV.L."),
              new Codec("clearvideo", "Iterated Systems ClearVideo", "D.V.L."),
              new Codec("cljr", "Cirrus Logic AccuPak", "DEVIL."),
              new Codec("cllc", "Canopus Lossless Codec", "D.VI.S"),
              new Codec("cmv", "Electronic Arts CMV video (decoders: eacmv )", "D.V.L."),
              new Codec("cpia", "CPiA video format", "D.V..."),
              new Codec("cscd", "CamStudio (decoders: camstudio )", "D.V..S"),
              new Codec("cyuv", "Creative YUV (CYUV)", "D.VIL."),
              new Codec("daala", "Daala", "..V.LS"),
              new Codec("dds", "DirectDraw Surface image decoder", "D.VILS"),
              new Codec("dfa", "Chronomaster DFA", "D.V.L."),
              new Codec("dirac", "Dirac (encoders: vc2 )", "DEV.LS"),
              new Codec("dnxhd", "VC3/DNxHD", "DEVIL."),
              new Codec("dpx", "DPX (Digital Picture Exchange) image", "DEVI.S"),
              new Codec("dsicinvideo", "Delphine Software International CIN video", "D.V.L."),
              new Codec("dvvideo", "DV (Digital Video)", "DEVIL."),
              new Codec("dxa", "Feeble Files/ScummVM DXA", "D.V..S"),
              new Codec("dxtory", "Dxtory", "D.VI.S"),
              new Codec("dxv", "Resolume DXV", "D.VIL."),
              new Codec("escape124", "Escape 124", "D.V.L."),
              new Codec("escape130", "Escape 130", "D.V.L."),
              new Codec("exr", "OpenEXR image", "D.VILS"),
              new Codec("ffv1", "FFmpeg video codec #1", "DEV..S"),
              new Codec("ffvhuff", "Huffyuv FFmpeg variant", "DEVI.S"),
              new Codec("fic", "Mirillis FIC", "D.V.L."),
              new Codec("fits", "FITS (Flexible Image Transport System)", "DEVI.S"),
              new Codec("flashsv", "Flash Screen Video v1", "DEV..S"),
              new Codec("flashsv2", "Flash Screen Video v2", "DEV.L."),
              new Codec("flic", "Autodesk Animator Flic video", "D.V..S"),
              new Codec(
                  "flv1",
                  "FLV / Sorenson Spark / Sorenson H.263 (Flash Video) (decoders: flv ) (encoders: flv )",
                  "DEV.L."),
              new Codec("fmvc", "FM Screen Capture Codec", "D.V..S"),
              new Codec("fraps", "Fraps", "D.VI.S"),
              new Codec("frwu", "Forward Uncompressed", "D.VI.S"),
              new Codec("g2m", "Go2Meeting", "D.V.L."),
              new Codec("gdv", "Gremlin Digital Video", "D.V.L."),
              new Codec("gif", "CompuServe GIF (Graphics Interchange Format)", "DEV..S"),
              new Codec("h261", "H.261", "DEV.L."),
              new Codec(
                  "h263", "H.263 / H.263-1996, H.263+ / H.263-1998 / H.263 version 2", "DEV.L."),
              new Codec("h263i", "Intel H.263", "D.V.L."),
              new Codec("h263p", "H.263+ / H.263-1998 / H.263 version 2", "DEV.L."),
              new Codec(
                  "h264",
                  "H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10 (decoders: h264 h264_qsv h264_cuvid ) (encoders: libx264 libx264rgb h264_amf h264_nvenc h264_qsv nvenc nvenc_h264 )",
                  "DEV.LS"),
              new Codec("hap", "Vidvox Hap", "DEVIL."),
              new Codec(
                  "hevc",
                  "H.265 / HEVC (High Efficiency Video Coding) (decoders: hevc hevc_qsv hevc_cuvid ) (encoders: libx265 nvenc_hevc hevc_amf hevc_nvenc hevc_qsv )",
                  "DEV.L."),
              new Codec("hnm4video", "HNM 4 video", "D.V.L."),
              new Codec("hq_hqa", "Canopus HQ/HQA", "D.VIL."),
              new Codec("hqx", "Canopus HQX", "D.VIL."),
              new Codec("huffyuv", "HuffYUV", "DEVI.S"),
              new Codec("hymt", "HuffYUV MT", "D.VI.S"),
              new Codec("idcin", "id Quake II CIN video (decoders: idcinvideo )", "D.V.L."),
              new Codec("idf", "iCEDraw text", "D.VI.."),
              new Codec(
                  "iff_ilbm", "IFF ACBM/ANIM/DEEP/ILBM/PBM/RGB8/RGBN (decoders: iff )", "D.V.L."),
              new Codec("imm4", "Infinity IMM4", "D.V.L."),
              new Codec("imm5", "Infinity IMM5", "D.V.L."),
              new Codec("indeo2", "Intel Indeo 2", "D.V.L."),
              new Codec("indeo3", "Intel Indeo 3", "D.V.L."),
              new Codec("indeo4", "Intel Indeo Video Interactive 4", "D.V.L."),
              new Codec("indeo5", "Intel Indeo Video Interactive 5", "D.V.L."),
              new Codec("interplayvideo", "Interplay MVE video", "D.V.L."),
              new Codec(
                  "jpeg2000",
                  "JPEG 2000 (decoders: jpeg2000 libopenjpeg ) (encoders: jpeg2000 libopenjpeg )",
                  "DEVILS"),
              new Codec("jpegls", "JPEG-LS", "DEVILS"),
              new Codec("jv", "Bitmap Brothers JV video", "D.VIL."),
              new Codec("kgv1", "Kega Game Video", "D.V.L."),
              new Codec("kmvc", "Karl Morton's video codec", "D.V.L."),
              new Codec("lagarith", "Lagarith lossless", "D.VI.S"),
              new Codec("ljpeg", "Lossless JPEG", ".EVI.S"),
              new Codec("loco", "LOCO", "D.VI.S"),
              new Codec("lscr", "LEAD Screen Capture", "D.V.L."),
              new Codec("m101", "Matrox Uncompressed SD", "D.VI.S"),
              new Codec("mad", "Electronic Arts Madcow Video (decoders: eamad )", "D.V.L."),
              new Codec("magicyuv", "MagicYUV video", "DEVI.S"),
              new Codec("mdec", "Sony PlayStation MDEC (Motion DECoder)", "D.VIL."),
              new Codec("mimic", "Mimic", "D.V.L."),
              new Codec(
                  "mjpeg",
                  "Motion JPEG (decoders: mjpeg mjpeg_cuvid mjpeg_qsv ) (encoders: mjpeg mjpeg_qsv )",
                  "DEVIL."),
              new Codec("mjpegb", "Apple MJPEG-B", "D.VIL."),
              new Codec("mmvideo", "American Laser Games MM Video", "D.V.L."),
              new Codec("motionpixels", "Motion Pixels video", "D.V.L."),
              new Codec("mpeg1video", "MPEG-1 video (decoders: mpeg1video mpeg1_cuvid )", "DEV.L."),
              new Codec(
                  "mpeg2video",
                  "MPEG-2 video (decoders: mpeg2video mpegvideo mpeg2_qsv mpeg2_cuvid ) (encoders: mpeg2video mpeg2_qsv )",
                  "DEV.L."),
              new Codec(
                  "mpeg4",
                  "MPEG-4 part 2 (decoders: mpeg4 mpeg4_cuvid ) (encoders: mpeg4 libxvid )",
                  "DEV.L."),
              new Codec("msa1", "MS ATC Screen", "D.V.L."),
              new Codec("mscc", "Mandsoft Screen Capture Codec", "D.VI.S"),
              new Codec("msmpeg4v1", "MPEG-4 part 2 Microsoft variant version 1", "D.V.L."),
              new Codec("msmpeg4v2", "MPEG-4 part 2 Microsoft variant version 2", "DEV.L."),
              new Codec(
                  "msmpeg4v3",
                  "MPEG-4 part 2 Microsoft variant version 3 (decoders: msmpeg4 ) (encoders: msmpeg4 )",
                  "DEV.L."),
              new Codec("msrle", "Microsoft RLE", "D.V..S"),
              new Codec("mss1", "MS Screen 1", "D.V.L."),
              new Codec("mss2", "MS Windows Media Video V9 Screen", "D.VIL."),
              new Codec("msvideo1", "Microsoft Video 1", "DEV.L."),
              new Codec("mszh", "LCL (LossLess Codec Library) MSZH", "D.VI.S"),
              new Codec("mts2", "MS Expression Encoder Screen", "D.V.L."),
              new Codec("mvc1", "Silicon Graphics Motion Video Compressor 1", "D.VIL."),
              new Codec("mvc2", "Silicon Graphics Motion Video Compressor 2", "D.VIL."),
              new Codec("mvdv", "MidiVid VQ", "D.V.L."),
              new Codec("mvha", "MidiVid Archive Codec", "D.VIL."),
              new Codec("mwsc", "MatchWare Screen Capture Codec", "D.V..S"),
              new Codec("mxpeg", "Mobotix MxPEG video", "D.V.L."),
              new Codec("nuv", "NuppelVideo/RTJPEG", "D.V.L."),
              new Codec("paf_video", "Amazing Studio Packed Animation File Video", "D.V.L."),
              new Codec("pam", "PAM (Portable AnyMap) image", "DEVI.S"),
              new Codec("pbm", "PBM (Portable BitMap) image", "DEVI.S"),
              new Codec("pcx", "PC Paintbrush PCX image", "DEVI.S"),
              new Codec("pgm", "PGM (Portable GrayMap) image", "DEVI.S"),
              new Codec("pgmyuv", "PGMYUV (Portable GrayMap YUV) image", "DEVI.S"),
              new Codec("pictor", "Pictor/PC Paint", "D.VIL."),
              new Codec("pixlet", "Apple Pixlet", "D.VIL."),
              new Codec("png", "PNG (Portable Network Graphics) image", "DEV..S"),
              new Codec("ppm", "PPM (Portable PixelMap) image", "DEVI.S"),
              new Codec(
                  "prores",
                  "Apple ProRes (iCodec Pro) (encoders: prores prores_aw prores_ks )",
                  "DEVIL."),
              new Codec("prosumer", "Brooktree ProSumer Video", "D.VIL."),
              new Codec("psd", "Photoshop PSD file", "D.VI.S"),
              new Codec("ptx", "V.Flash PTX image", "D.VIL."),
              new Codec("qdraw", "Apple QuickDraw", "D.VI.S"),
              new Codec("qpeg", "Q-team QPEG", "D.V.L."),
              new Codec("qtrle", "QuickTime Animation (RLE) video", "DEV..S"),
              new Codec("r10k", "AJA Kona 10-bit RGB Codec", "DEVI.S"),
              new Codec("r210", "Uncompressed RGB 10-bit", "DEVI.S"),
              new Codec("rasc", "RemotelyAnywhere Screen Capture", "D.V.L."),
              new Codec("rawvideo", "raw video", "DEVI.S"),
              new Codec("rl2", "RL2 video", "D.VIL."),
              new Codec(
                  "roq", "id RoQ video (decoders: roqvideo ) (encoders: roqvideo )", "DEV.L."),
              new Codec("rpza", "QuickTime video (RPZA)", "D.V.L."),
              new Codec("rscc", "innoHeim/Rsupport Screen Capture Codec", "D.V..S"),
              new Codec("rv10", "RealVideo 1.0", "DEV.L."),
              new Codec("rv20", "RealVideo 2.0", "DEV.L."),
              new Codec("rv30", "RealVideo 3.0", "D.V.L."),
              new Codec("rv40", "RealVideo 4.0", "D.V.L."),
              new Codec("sanm", "LucasArts SANM/SMUSH video", "D.V.L."),
              new Codec("scpr", "ScreenPressor", "D.V.LS"),
              new Codec("screenpresso", "Screenpresso", "D.V..S"),
              new Codec("sgi", "SGI image", "DEVI.S"),
              new Codec("sgirle", "SGI RLE 8-bit", "D.VI.S"),
              new Codec("sheervideo", "BitJazz SheerVideo", "D.VI.S"),
              new Codec("smackvideo", "Smacker video (decoders: smackvid )", "D.V.L."),
              new Codec("smc", "QuickTime Graphics (SMC)", "D.V.L."),
              new Codec("smvjpeg", "Sigmatel Motion Video", "D.V..."),
              new Codec("snow", "Snow", "DEV.LS"),
              new Codec("sp5x", "Sunplus JPEG (SP5X)", "D.VIL."),
              new Codec("speedhq", "NewTek SpeedHQ", "D.VIL."),
              new Codec("srgc", "Screen Recorder Gold Codec", "D.VI.S"),
              new Codec("sunrast", "Sun Rasterfile image", "DEVI.S"),
              new Codec("svg", "Scalable Vector Graphics", "..V..S"),
              new Codec("svq1", "Sorenson Vector Quantizer 1 / Sorenson Video 1 / SVQ1", "DEV.L."),
              new Codec("svq3", "Sorenson Vector Quantizer 3 / Sorenson Video 3 / SVQ3", "D.V.L."),
              new Codec("targa", "Truevision Targa image", "DEVI.S"),
              new Codec("targa_y216", "Pinnacle TARGA CineWave YUV16", "D.VI.S"),
              new Codec("tdsc", "TDSC", "D.V.L."),
              new Codec("tgq", "Electronic Arts TGQ video (decoders: eatgq )", "D.V.L."),
              new Codec("tgv", "Electronic Arts TGV video (decoders: eatgv )", "D.V.L."),
              new Codec("theora", "Theora (encoders: libtheora )", "DEV.L."),
              new Codec("thp", "Nintendo Gamecube THP video", "D.VIL."),
              new Codec("tiertexseqvideo", "Tiertex Limited SEQ video", "D.V.L."),
              new Codec("tiff", "TIFF image", "DEVI.S"),
              new Codec("tmv", "8088flex TMV", "D.VIL."),
              new Codec("tqi", "Electronic Arts TQI video (decoders: eatqi )", "D.V.L."),
              new Codec("truemotion1", "Duck TrueMotion 1.0", "D.V.L."),
              new Codec("truemotion2", "Duck TrueMotion 2.0", "D.V.L."),
              new Codec("truemotion2rt", "Duck TrueMotion 2.0 Real Time", "D.VIL."),
              new Codec("tscc", "TechSmith Screen Capture Codec (decoders: camtasia )", "D.V..S"),
              new Codec("tscc2", "TechSmith Screen Codec 2", "D.V.L."),
              new Codec("txd", "Renderware TXD (TeXture Dictionary) image", "D.VIL."),
              new Codec("ulti", "IBM UltiMotion (decoders: ultimotion )", "D.V.L."),
              new Codec("utvideo", "Ut Video", "DEVI.S"),
              new Codec("v210", "Uncompressed 4:2:2 10-bit", "DEVI.S"),
              new Codec("v210x", "Uncompressed 4:2:2 10-bit", "D.VI.S"),
              new Codec("v308", "Uncompressed packed 4:4:4", "DEVI.S"),
              new Codec("v408", "Uncompressed packed QT 4:4:4:4", "DEVI.S"),
              new Codec("v410", "Uncompressed 4:4:4 10-bit", "DEVI.S"),
              new Codec("vb", "Beam Software VB", "D.V.L."),
              new Codec("vble", "VBLE Lossless Codec", "D.VI.S"),
              new Codec("vc1", "SMPTE VC-1 (decoders: vc1 vc1_qsv vc1_cuvid )", "D.V.L."),
              new Codec("vc1image", "Windows Media Video 9 Image v2", "D.V.L."),
              new Codec("vcr1", "ATI VCR1", "D.VIL."),
              new Codec("vixl", "Miro VideoXL (decoders: xl )", "D.VIL."),
              new Codec("vmdvideo", "Sierra VMD video", "D.V.L."),
              new Codec("vmnc", "VMware Screen Codec / VMware Video", "D.V..S"),
              new Codec("vp3", "On2 VP3", "D.V.L."),
              new Codec("vp4", "On2 VP4", "D.V.L."),
              new Codec("vp5", "On2 VP5", "D.V.L."),
              new Codec("vp6", "On2 VP6", "D.V.L."),
              new Codec("vp6a", "On2 VP6 (Flash version, with alpha channel)", "D.V.L."),
              new Codec("vp6f", "On2 VP6 (Flash version)", "D.V.L."),
              new Codec("vp7", "On2 VP7", "D.V.L."),
              new Codec(
                  "vp8",
                  "On2 VP8 (decoders: vp8 libvpx vp8_cuvid vp8_qsv ) (encoders: libvpx )",
                  "DEV.L."),
              new Codec(
                  "vp9",
                  "Google VP9 (decoders: vp9 libvpx-vp9 vp9_cuvid vp9_qsv ) (encoders: libvpx-vp9 vp9_qsv )",
                  "DEV.L."),
              new Codec("wcmv", "WinCAM Motion Video", "D.V..S"),
              new Codec("webp", "WebP (encoders: libwebp_anim libwebp )", "DEVILS"),
              new Codec("wmv1", "Windows Media Video 7", "DEV.L."),
              new Codec("wmv2", "Windows Media Video 8", "DEV.L."),
              new Codec("wmv3", "Windows Media Video 9", "D.V.L."),
              new Codec("wmv3image", "Windows Media Video 9 Image", "D.V.L."),
              new Codec("wnv1", "Winnov WNV1", "D.VIL."),
              new Codec("wrapped_avframe", "AVFrame to AVPacket passthrough", "DEV..S"),
              new Codec(
                  "ws_vqa",
                  "Westwood Studios VQA (Vector Quantized Animation) video (decoders: vqavideo )",
                  "D.V.L."),
              new Codec("xan_wc3", "Wing Commander III / Xan", "D.V.L."),
              new Codec("xan_wc4", "Wing Commander IV / Xxan", "D.V.L."),
              new Codec("xbin", "eXtended BINary text", "D.VI.."),
              new Codec("xbm", "XBM (X BitMap) image", "DEVI.S"),
              new Codec("xface", "X-face image", "DEVIL."),
              new Codec("xpm", "XPM (X PixMap) image", "D.VI.S"),
              new Codec("xwd", "XWD (X Window Dump) image", "DEVI.S"),
              new Codec("y41p", "Uncompressed YUV 4:1:1 12-bit", "DEVI.S"),
              new Codec("ylc", "YUY2 Lossless Codec", "D.VI.S"),
              new Codec("yop", "Psygnosis YOP Video", "D.V.L."),
              new Codec("yuv4", "Uncompressed packed 4:2:0", "DEVI.S"),
              new Codec("zerocodec", "ZeroCodec Lossless Video", "D.V..S"),
              new Codec("zlib", "LCL (LossLess Codec Library) ZLIB", "DEVI.S"),
              new Codec("zmbv", "Zip Motion Blocks Video", "DEV..S"),
              new Codec("4gv", "4GV (Fourth Generation Vocoder)", "..AIL."),
              new Codec("8svx_exp", "8SVX exponential", "D.AIL."),
              new Codec("8svx_fib", "8SVX fibonacci", "D.AIL."),
              new Codec("aac", "AAC (Advanced Audio Coding) (decoders: aac aac_fixed )", "DEAIL."),
              new Codec("aac_latm", "AAC LATM (Advanced Audio Coding LATM syntax)", "D.AIL."),
              new Codec(
                  "ac3",
                  "ATSC A/52A (AC-3) (decoders: ac3 ac3_fixed ) (encoders: ac3 ac3_fixed )",
                  "DEAIL."),
              new Codec("acelp.kelvin", "Sipro ACELP.KELVIN", "D.AIL."),
              new Codec("adpcm_4xm", "ADPCM 4X Movie", "D.AIL."),
              new Codec("adpcm_adx", "SEGA CRI ADX ADPCM", "DEAIL."),
              new Codec("adpcm_afc", "ADPCM Nintendo Gamecube AFC", "D.AIL."),
              new Codec("adpcm_agm", "ADPCM AmuseGraphics Movie AGM", "D.AIL."),
              new Codec("adpcm_aica", "ADPCM Yamaha AICA", "D.AIL."),
              new Codec("adpcm_ct", "ADPCM Creative Technology", "D.AIL."),
              new Codec("adpcm_dtk", "ADPCM Nintendo Gamecube DTK", "D.AIL."),
              new Codec("adpcm_ea", "ADPCM Electronic Arts", "D.AIL."),
              new Codec("adpcm_ea_maxis_xa", "ADPCM Electronic Arts Maxis CDROM XA", "D.AIL."),
              new Codec("adpcm_ea_r1", "ADPCM Electronic Arts R1", "D.AIL."),
              new Codec("adpcm_ea_r2", "ADPCM Electronic Arts R2", "D.AIL."),
              new Codec("adpcm_ea_r3", "ADPCM Electronic Arts R3", "D.AIL."),
              new Codec("adpcm_ea_xas", "ADPCM Electronic Arts XAS", "D.AIL."),
              new Codec("adpcm_g722", "G.722 ADPCM (decoders: g722 ) (encoders: g722 )", "DEAIL."),
              new Codec("adpcm_g726", "G.726 ADPCM (decoders: g726 ) (encoders: g726 )", "DEAIL."),
              new Codec(
                  "adpcm_g726le",
                  "G.726 ADPCM little-endian (decoders: g726le ) (encoders: g726le )",
                  "DEAIL."),
              new Codec("adpcm_ima_amv", "ADPCM IMA AMV", "D.AIL."),
              new Codec("adpcm_ima_apc", "ADPCM IMA CRYO APC", "D.AIL."),
              new Codec("adpcm_ima_dat4", "ADPCM IMA Eurocom DAT4", "D.AIL."),
              new Codec("adpcm_ima_dk3", "ADPCM IMA Duck DK3", "D.AIL."),
              new Codec("adpcm_ima_dk4", "ADPCM IMA Duck DK4", "D.AIL."),
              new Codec("adpcm_ima_ea_eacs", "ADPCM IMA Electronic Arts EACS", "D.AIL."),
              new Codec("adpcm_ima_ea_sead", "ADPCM IMA Electronic Arts SEAD", "D.AIL."),
              new Codec("adpcm_ima_iss", "ADPCM IMA Funcom ISS", "D.AIL."),
              new Codec("adpcm_ima_oki", "ADPCM IMA Dialogic OKI", "D.AIL."),
              new Codec("adpcm_ima_qt", "ADPCM IMA QuickTime", "DEAIL."),
              new Codec("adpcm_ima_rad", "ADPCM IMA Radical", "D.AIL."),
              new Codec("adpcm_ima_smjpeg", "ADPCM IMA Loki SDL MJPEG", "D.AIL."),
              new Codec("adpcm_ima_wav", "ADPCM IMA WAV", "DEAIL."),
              new Codec("adpcm_ima_ws", "ADPCM IMA Westwood", "D.AIL."),
              new Codec("adpcm_ms", "ADPCM Microsoft", "DEAIL."),
              new Codec("adpcm_mtaf", "ADPCM MTAF", "D.AIL."),
              new Codec("adpcm_psx", "ADPCM Playstation", "D.AIL."),
              new Codec("adpcm_sbpro_2", "ADPCM Sound Blaster Pro 2-bit", "D.AIL."),
              new Codec("adpcm_sbpro_3", "ADPCM Sound Blaster Pro 2.6-bit", "D.AIL."),
              new Codec("adpcm_sbpro_4", "ADPCM Sound Blaster Pro 4-bit", "D.AIL."),
              new Codec("adpcm_swf", "ADPCM Shockwave Flash", "DEAIL."),
              new Codec("adpcm_thp", "ADPCM Nintendo THP", "D.AIL."),
              new Codec("adpcm_thp_le", "ADPCM Nintendo THP (Little-Endian)", "D.AIL."),
              new Codec("adpcm_vima", "LucasArts VIMA audio", "D.AIL."),
              new Codec("adpcm_xa", "ADPCM CDROM XA", "D.AIL."),
              new Codec("adpcm_yamaha", "ADPCM Yamaha", "DEAIL."),
              new Codec("alac", "ALAC (Apple Lossless Audio Codec)", "DEAI.S"),
              new Codec(
                  "amr_nb",
                  "AMR-NB (Adaptive Multi-Rate NarrowBand) (decoders: amrnb libopencore_amrnb ) (encoders: libopencore_amrnb )",
                  "DEAIL."),
              new Codec(
                  "amr_wb",
                  "AMR-WB (Adaptive Multi-Rate WideBand) (decoders: amrwb libopencore_amrwb ) (encoders: libvo_amrwbenc )",
                  "DEAIL."),
              new Codec("ape", "Monkey's Audio", "D.AI.S"),
              new Codec("aptx", "aptX (Audio Processing Technology for Bluetooth)", "DEAIL."),
              new Codec("aptx_hd", "aptX HD (Audio Processing Technology for Bluetooth)", "DEAIL."),
              new Codec("atrac1", "ATRAC1 (Adaptive TRansform Acoustic Coding)", "D.AIL."),
              new Codec("atrac3", "ATRAC3 (Adaptive TRansform Acoustic Coding 3)", "D.AIL."),
              new Codec(
                  "atrac3al",
                  "ATRAC3 AL (Adaptive TRansform Acoustic Coding 3 Advanced Lossless)",
                  "D.AI.S"),
              new Codec(
                  "atrac3p",
                  "ATRAC3+ (Adaptive TRansform Acoustic Coding 3+) (decoders: atrac3plus )",
                  "D.AIL."),
              new Codec(
                  "atrac3pal",
                  "ATRAC3+ AL (Adaptive TRansform Acoustic Coding 3+ Advanced Lossless) (decoders: atrac3plusal )",
                  "D.AI.S"),
              new Codec("atrac9", "ATRAC9 (Adaptive TRansform Acoustic Coding 9)", "D.AIL."),
              new Codec("avc", "On2 Audio for Video Codec (decoders: on2avc )", "D.AIL."),
              new Codec("binkaudio_dct", "Bink Audio (DCT)", "D.AIL."),
              new Codec("binkaudio_rdft", "Bink Audio (RDFT)", "D.AIL."),
              new Codec("bmv_audio", "Discworld II BMV audio", "D.AIL."),
              new Codec("celt", "Constrained Energy Lapped Transform (CELT)", "..AIL."),
              new Codec("codec2", "codec2 (very low bitrate speech codec)", "..AIL."),
              new Codec("comfortnoise", "RFC 3389 Comfort Noise", "DEAIL."),
              new Codec("cook", "Cook / Cooker / Gecko (RealAudio G2)", "D.AIL."),
              new Codec("dolby_e", "Dolby E", "D.AIL."),
              new Codec(
                  "dsd_lsbf", "DSD (Direct Stream Digital), least significant bit first", "D.AIL."),
              new Codec(
                  "dsd_lsbf_planar",
                  "DSD (Direct Stream Digital), least significant bit first, planar",
                  "D.AIL."),
              new Codec(
                  "dsd_msbf", "DSD (Direct Stream Digital), most significant bit first", "D.AIL."),
              new Codec(
                  "dsd_msbf_planar",
                  "DSD (Direct Stream Digital), most significant bit first, planar",
                  "D.AIL."),
              new Codec("dsicinaudio", "Delphine Software International CIN audio", "D.AIL."),
              new Codec(
                  "dss_sp", "Digital Speech Standard - Standard Play mode (DSS SP)", "D.AIL."),
              new Codec("dst", "DST (Direct Stream Transfer)", "D.AI.S"),
              new Codec(
                  "dts",
                  "DCA (DTS Coherent Acoustics) (decoders: dca ) (encoders: dca )",
                  "DEAILS"),
              new Codec("dvaudio", "DV audio", "D.AIL."),
              new Codec("eac3", "ATSC A/52B (AC-3, E-AC-3)", "DEAIL."),
              new Codec("evrc", "EVRC (Enhanced Variable Rate Codec)", "D.AIL."),
              new Codec("flac", "FLAC (Free Lossless Audio Codec)", "DEAI.S"),
              new Codec("g723_1", "G.723.1", "DEAIL."),
              new Codec("g729", "G.729", "D.AIL."),
              new Codec("gremlin_dpcm", "DPCM Gremlin", "D.AIL."),
              new Codec("gsm", "GSM", "D.AIL."),
              new Codec("gsm_ms", "GSM Microsoft variant", "D.AIL."),
              new Codec("hcom", "HCOM Audio", "D.AIL."),
              new Codec("iac", "IAC (Indeo Audio Coder)", "D.AIL."),
              new Codec("ilbc", "iLBC (Internet Low Bitrate Codec)", "D.AIL."),
              new Codec("imc", "IMC (Intel Music Coder)", "D.AIL."),
              new Codec("interplay_dpcm", "DPCM Interplay", "D.AIL."),
              new Codec("interplayacm", "Interplay ACM", "D.AIL."),
              new Codec("mace3", "MACE (Macintosh Audio Compression/Expansion) 3:1", "D.AIL."),
              new Codec("mace6", "MACE (Macintosh Audio Compression/Expansion) 6:1", "D.AIL."),
              new Codec("metasound", "Voxware MetaSound", "D.AIL."),
              new Codec("mlp", "MLP (Meridian Lossless Packing)", "DEAI.S"),
              new Codec("mp1", "MP1 (MPEG audio layer 1) (decoders: mp1 mp1float )", "D.AIL."),
              new Codec(
                  "mp2",
                  "MP2 (MPEG audio layer 2) (decoders: mp2 mp2float ) (encoders: mp2 mp2fixed libtwolame )",
                  "DEAIL."),
              new Codec(
                  "mp3",
                  "MP3 (MPEG audio layer 3) (decoders: mp3float mp3 ) (encoders: libmp3lame libshine )",
                  "DEAIL."),
              new Codec(
                  "mp3adu",
                  "ADU (Application Data Unit) MP3 (MPEG audio layer 3) (decoders: mp3adufloat mp3adu )",
                  "D.AIL."),
              new Codec("mp3on4", "MP3onMP4 (decoders: mp3on4float mp3on4 )", "D.AIL."),
              new Codec("mp4als", "MPEG-4 Audio Lossless Coding (ALS) (decoders: als )", "D.AI.S"),
              new Codec("mpegh_3d_audio", "MPEG-H 3D Audio", "..A.L."),
              new Codec("musepack7", "Musepack SV7 (decoders: mpc7 )", "D.AIL."),
              new Codec("musepack8", "Musepack SV8 (decoders: mpc8 )", "D.AIL."),
              new Codec("nellymoser", "Nellymoser Asao", "DEAIL."),
              new Codec(
                  "opus",
                  "Opus (Opus Interactive Audio Codec) (decoders: opus libopus ) (encoders: opus libopus )",
                  "DEAIL."),
              new Codec("paf_audio", "Amazing Studio Packed Animation File Audio", "D.AIL."),
              new Codec("pcm_alaw", "PCM A-law / G.711 A-law", "DEAIL."),
              new Codec(
                  "pcm_bluray", "PCM signed 16|20|24-bit big-endian for Blu-ray media", "D.AI.S"),
              new Codec("pcm_dvd", "PCM signed 20|24-bit big-endian", "DEAI.S"),
              new Codec("pcm_f16le", "PCM 16.8 floating point little-endian", "D.AI.S"),
              new Codec("pcm_f24le", "PCM 24.0 floating point little-endian", "D.AI.S"),
              new Codec("pcm_f32be", "PCM 32-bit floating point big-endian", "DEAI.S"),
              new Codec("pcm_f32le", "PCM 32-bit floating point little-endian", "DEAI.S"),
              new Codec("pcm_f64be", "PCM 64-bit floating point big-endian", "DEAI.S"),
              new Codec("pcm_f64le", "PCM 64-bit floating point little-endian", "DEAI.S"),
              new Codec("pcm_lxf", "PCM signed 20-bit little-endian planar", "D.AI.S"),
              new Codec("pcm_mulaw", "PCM mu-law / G.711 mu-law", "DEAIL."),
              new Codec("pcm_s16be", "PCM signed 16-bit big-endian", "DEAI.S"),
              new Codec("pcm_s16be_planar", "PCM signed 16-bit big-endian planar", "DEAI.S"),
              new Codec("pcm_s16le", "PCM signed 16-bit little-endian", "DEAI.S"),
              new Codec("pcm_s16le_planar", "PCM signed 16-bit little-endian planar", "DEAI.S"),
              new Codec("pcm_s24be", "PCM signed 24-bit big-endian", "DEAI.S"),
              new Codec("pcm_s24daud", "PCM D-Cinema audio signed 24-bit", "DEAI.S"),
              new Codec("pcm_s24le", "PCM signed 24-bit little-endian", "DEAI.S"),
              new Codec("pcm_s24le_planar", "PCM signed 24-bit little-endian planar", "DEAI.S"),
              new Codec("pcm_s32be", "PCM signed 32-bit big-endian", "DEAI.S"),
              new Codec("pcm_s32le", "PCM signed 32-bit little-endian", "DEAI.S"),
              new Codec("pcm_s32le_planar", "PCM signed 32-bit little-endian planar", "DEAI.S"),
              new Codec("pcm_s64be", "PCM signed 64-bit big-endian", "DEAI.S"),
              new Codec("pcm_s64le", "PCM signed 64-bit little-endian", "DEAI.S"),
              new Codec("pcm_s8", "PCM signed 8-bit", "DEAI.S"),
              new Codec("pcm_s8_planar", "PCM signed 8-bit planar", "DEAI.S"),
              new Codec("pcm_u16be", "PCM unsigned 16-bit big-endian", "DEAI.S"),
              new Codec("pcm_u16le", "PCM unsigned 16-bit little-endian", "DEAI.S"),
              new Codec("pcm_u24be", "PCM unsigned 24-bit big-endian", "DEAI.S"),
              new Codec("pcm_u24le", "PCM unsigned 24-bit little-endian", "DEAI.S"),
              new Codec("pcm_u32be", "PCM unsigned 32-bit big-endian", "DEAI.S"),
              new Codec("pcm_u32le", "PCM unsigned 32-bit little-endian", "DEAI.S"),
              new Codec("pcm_u8", "PCM unsigned 8-bit", "DEAI.S"),
              new Codec("pcm_vidc", "PCM Archimedes VIDC", "DEAIL."),
              new Codec("pcm_zork", "PCM Zork", "D.AIL."),
              new Codec("qcelp", "QCELP / PureVoice", "D.AIL."),
              new Codec("qdm2", "QDesign Music Codec 2", "D.AIL."),
              new Codec("qdmc", "QDesign Music", "D.AIL."),
              new Codec(
                  "ra_144",
                  "RealAudio 1.0 (14.4K) (decoders: real_144 ) (encoders: real_144 )",
                  "DEAIL."),
              new Codec("ra_288", "RealAudio 2.0 (28.8K) (decoders: real_288 )", "D.AIL."),
              new Codec("ralf", "RealAudio Lossless", "D.AI.S"),
              new Codec("roq_dpcm", "DPCM id RoQ", "DEAIL."),
              new Codec("s302m", "SMPTE 302M", "DEAI.S"),
              new Codec("sbc", "SBC (low-complexity subband codec)", "DEAIL."),
              new Codec("sdx2_dpcm", "DPCM Squareroot-Delta-Exact", "D.AIL."),
              new Codec("shorten", "Shorten", "D.AI.S"),
              new Codec("sipr", "RealAudio SIPR / ACELP.NET", "D.AIL."),
              new Codec("smackaudio", "Smacker audio (decoders: smackaud )", "D.AIL."),
              new Codec("smv", "SMV (Selectable Mode Vocoder)", "..AIL."),
              new Codec("sol_dpcm", "DPCM Sol", "D.AIL."),
              new Codec("sonic", "Sonic", "DEAI.."),
              new Codec("sonicls", "Sonic lossless", ".EAI.."),
              new Codec("speex", "Speex (decoders: libspeex ) (encoders: libspeex )", "DEAIL."),
              new Codec("tak", "TAK (Tom's lossless Audio Kompressor)", "D.AI.S"),
              new Codec("truehd", "TrueHD", "DEA..S"),
              new Codec("truespeech", "DSP Group TrueSpeech", "D.AIL."),
              new Codec("tta", "TTA (True Audio)", "DEAI.S"),
              new Codec("twinvq", "VQF TwinVQ", "D.AIL."),
              new Codec("vmdaudio", "Sierra VMD audio", "D.AIL."),
              new Codec(
                  "vorbis",
                  "Vorbis (decoders: vorbis libvorbis ) (encoders: vorbis libvorbis )",
                  "DEAIL."),
              new Codec("wavesynth", "Wave synthesis pseudo-codec", "D.AI.."),
              new Codec("wavpack", "WavPack (encoders: wavpack libwavpack )", "DEAILS"),
              new Codec("westwood_snd1", "Westwood Audio (SND1) (decoders: ws_snd1 )", "D.AIL."),
              new Codec("wmalossless", "Windows Media Audio Lossless", "D.AI.S"),
              new Codec("wmapro", "Windows Media Audio 9 Professional", "D.AIL."),
              new Codec("wmav1", "Windows Media Audio 1", "DEAIL."),
              new Codec("wmav2", "Windows Media Audio 2", "DEAIL."),
              new Codec("wmavoice", "Windows Media Audio Voice", "D.AIL."),
              new Codec("xan_dpcm", "DPCM Xan", "D.AIL."),
              new Codec("xma1", "Xbox Media Audio 1", "D.AIL."),
              new Codec("xma2", "Xbox Media Audio 2", "D.AIL."),
              new Codec("bin_data", "binary data", "..D..."),
              new Codec("dvd_nav_packet", "DVD Nav packet", "..D..."),
              new Codec("epg", "Electronic Program Guide", "..D..."),
              new Codec("klv", "SMPTE 336M Key-Length-Value (KLV) metadata", "..D..."),
              new Codec("otf", "OpenType font", "..D..."),
              new Codec("scte_35", "SCTE 35 Message Queue", "..D..."),
              new Codec("timed_id3", "timed ID3 metadata", "..D..."),
              new Codec("ttf", "TrueType font", "..D..."),
              new Codec("arib_caption", "ARIB STD-B24 caption", "..S..."),
              new Codec(
                  "ass",
                  "ASS (Advanced SSA) subtitle (decoders: ssa ass ) (encoders: ssa ass )",
                  "DES..."),
              new Codec(
                  "dvb_subtitle",
                  "DVB subtitles (decoders: dvbsub ) (encoders: dvbsub )",
                  "DES..."),
              new Codec("dvb_teletext", "DVB teletext", "..S..."),
              new Codec(
                  "dvd_subtitle",
                  "DVD subtitles (decoders: dvdsub ) (encoders: dvdsub )",
                  "DES..."),
              new Codec("eia_608", "EIA-608 closed captions (decoders: cc_dec )", "D.S..."),
              new Codec(
                  "hdmv_pgs_subtitle",
                  "HDMV Presentation Graphic Stream subtitles (decoders: pgssub )",
                  "D.S..."),
              new Codec("hdmv_text_subtitle", "HDMV Text subtitle", "..S..."),
              new Codec("jacosub", "JACOsub subtitle", "D.S..."),
              new Codec("microdvd", "MicroDVD subtitle", "D.S..."),
              new Codec("mov_text", "MOV text", "DES..."),
              new Codec("mpl2", "MPL2 subtitle", "D.S..."),
              new Codec("pjs", "PJS (Phoenix Japanimation Society) subtitle", "D.S..."),
              new Codec("realtext", "RealText subtitle", "D.S..."),
              new Codec("sami", "SAMI subtitle", "D.S..."),
              new Codec("srt", "SubRip subtitle with embedded timing", "..S..."),
              new Codec("ssa", "SSA (SubStation Alpha) subtitle", "..S..."),
              new Codec("stl", "Spruce subtitle format", "D.S..."),
              new Codec(
                  "subrip",
                  "SubRip subtitle (decoders: srt subrip ) (encoders: srt subrip )",
                  "DES..."),
              new Codec("subviewer", "SubViewer subtitle", "D.S..."),
              new Codec("subviewer1", "SubViewer v1 subtitle", "D.S..."),
              new Codec("text", "raw UTF-8 text", "DES..."),
              new Codec("ttml", "Timed Text Markup Language", "..S..."),
              new Codec("vplayer", "VPlayer subtitle", "D.S..."),
              new Codec("webvtt", "WebVTT subtitle", "DES..."),
              new Codec("xsub", "XSUB", "DES..."))
          .build();
}
