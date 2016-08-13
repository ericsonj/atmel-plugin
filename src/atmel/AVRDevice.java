package atmel;

import java.util.LinkedList;

/**
 * list AVR devices.
 *
 * @author ejoseph
 */
public class AVRDevice {

    private final LinkedList<MMCDevice> mmcList;
    private final LinkedList<ProgrammerDevice> progList;

    static AVRDevice instance;

    static {
        instance = new AVRDevice();
    }

    private AVRDevice() {
        mmcList = new LinkedList<>();
        progList = new LinkedList<>();
        loadMMCDevices(mmcList);
        loadProgDevices(progList);
    }

    public static AVRDevice getInstance() {
        return instance;
    }

    public LinkedList<MMCDevice> getMmcList() {
        return mmcList;
    }

    public LinkedList<ProgrammerDevice> getProgList() {
        return progList;
    }

    private void loadMMCDevices(LinkedList<MMCDevice> mmcList) {
        mmcList.add(new MMCDevice("uc3a0512", "AT32UC3A0512"));
        mmcList.add(new MMCDevice("c128", "AT90CAN128"));
        mmcList.add(new MMCDevice("c32", "AT90CAN32"));
        mmcList.add(new MMCDevice("c64", "AT90CAN64"));
        mmcList.add(new MMCDevice("pwm2", "AT90PWM2"));
        mmcList.add(new MMCDevice("pwm2b", "AT90PWM2B"));
        mmcList.add(new MMCDevice("pwm3", "AT90PWM3"));
        mmcList.add(new MMCDevice("pwm316", "AT90PWM316"));
        mmcList.add(new MMCDevice("pwm3b", "AT90PWM3B"));
        mmcList.add(new MMCDevice("1200", "AT90S1200"));
        mmcList.add(new MMCDevice("2313", "AT90S2313"));
        mmcList.add(new MMCDevice("2333", "AT90S2333"));
        mmcList.add(new MMCDevice("2343", "AT90S2343"));
        mmcList.add(new MMCDevice("4414", "AT90S4414"));
        mmcList.add(new MMCDevice("4433", "AT90S4433"));
        mmcList.add(new MMCDevice("4434", "AT90S4434"));
        mmcList.add(new MMCDevice("8515", "AT90S8515"));
        mmcList.add(new MMCDevice("8535", "AT90S8535"));
        mmcList.add(new MMCDevice("usb1286", "AT90USB1286"));
        mmcList.add(new MMCDevice("usb1287", "AT90USB1287"));
        mmcList.add(new MMCDevice("usb162", "AT90USB162"));
        mmcList.add(new MMCDevice("usb646", "AT90USB646"));
        mmcList.add(new MMCDevice("usb647", "AT90USB647"));
        mmcList.add(new MMCDevice("usb82", "AT90USB82"));
        mmcList.add(new MMCDevice("m103", "ATmega103"));
        mmcList.add(new MMCDevice("m128", "ATmega128"));
        mmcList.add(new MMCDevice("m1280", "ATmega1280"));
        mmcList.add(new MMCDevice("m1281", "ATmega1281"));
        mmcList.add(new MMCDevice("m1284", "ATmega1284"));
        mmcList.add(new MMCDevice("m1284p", "ATmega1284P"));
        mmcList.add(new MMCDevice("m1284rfr2", "ATmega1284RFR2"));
        mmcList.add(new MMCDevice("m128rfa1", "ATmega128RFA1"));
        mmcList.add(new MMCDevice("m128rfr2", "ATmega128RFR2"));
        mmcList.add(new MMCDevice("m16", "ATmega16"));
        mmcList.add(new MMCDevice("m161", "ATmega161"));
        mmcList.add(new MMCDevice("m162", "ATmega162"));
        mmcList.add(new MMCDevice("m163", "ATmega163"));
        mmcList.add(new MMCDevice("m164p", "ATmega164P"));
        mmcList.add(new MMCDevice("m168", "ATmega168"));
        mmcList.add(new MMCDevice("m168p", "ATmega168P"));
        mmcList.add(new MMCDevice("m169", "ATmega169"));
        mmcList.add(new MMCDevice("m16u2", "ATmega16U2"));
        mmcList.add(new MMCDevice("m2560", "ATmega2560"));
        mmcList.add(new MMCDevice("m2561", "ATmega2561"));
        mmcList.add(new MMCDevice("m2564rfr2", "ATmega2564RFR2"));
        mmcList.add(new MMCDevice("m256rfr2", "ATmega256RFR2"));
        mmcList.add(new MMCDevice("m32", "ATmega32"));
        mmcList.add(new MMCDevice("m324p", "ATmega324P"));
        mmcList.add(new MMCDevice("m324pa", "ATmega324PA"));
        mmcList.add(new MMCDevice("m325", "ATmega325"));
        mmcList.add(new MMCDevice("m3250", "ATmega3250"));
        mmcList.add(new MMCDevice("m328", "ATmega328"));
        mmcList.add(new MMCDevice("m328p", "ATmega328P"));
        mmcList.add(new MMCDevice("m329", "ATmega329"));
        mmcList.add(new MMCDevice("m3290", "ATmega3290"));
        mmcList.add(new MMCDevice("m3290p", "ATmega3290P"));
        mmcList.add(new MMCDevice("m329p", "ATmega329P"));
        mmcList.add(new MMCDevice("m32u2", "ATmega32U2"));
        mmcList.add(new MMCDevice("m32u4", "ATmega32U4"));
        mmcList.add(new MMCDevice("m406", "ATMEGA406"));
        mmcList.add(new MMCDevice("m48", "ATmega48"));
        mmcList.add(new MMCDevice("m48p", "ATmega48P"));
        mmcList.add(new MMCDevice("m64", "ATmega64"));
        mmcList.add(new MMCDevice("m640", "ATmega640"));
        mmcList.add(new MMCDevice("m644", "ATmega644"));
        mmcList.add(new MMCDevice("m644p", "ATmega644P"));
        mmcList.add(new MMCDevice("m644rfr2", "ATmega644RFR2"));
        mmcList.add(new MMCDevice("m645", "ATmega645"));
        mmcList.add(new MMCDevice("m6450", "ATmega6450"));
        mmcList.add(new MMCDevice("m649", "ATmega649"));
        mmcList.add(new MMCDevice("m6490", "ATmega6490"));
        mmcList.add(new MMCDevice("m64rfr2", "ATmega64RFR2"));
        mmcList.add(new MMCDevice("m8", "ATmega8"));
        mmcList.add(new MMCDevice("m8515", "ATmega8515"));
        mmcList.add(new MMCDevice("m8535", "ATmega8535"));
        mmcList.add(new MMCDevice("m88", "ATmega88"));
        mmcList.add(new MMCDevice("m88p", "ATmega88P"));
        mmcList.add(new MMCDevice("m8u2", "ATmega8U2"));
        mmcList.add(new MMCDevice("t10", "ATtiny10"));
        mmcList.add(new MMCDevice("t11", "ATtiny11"));
        mmcList.add(new MMCDevice("t12", "ATtiny12"));
        mmcList.add(new MMCDevice("t13", "ATtiny13"));
        mmcList.add(new MMCDevice("t15", "ATtiny15"));
        mmcList.add(new MMCDevice("t1634", "ATtiny1634"));
        mmcList.add(new MMCDevice("t20", "ATtiny20"));
        mmcList.add(new MMCDevice("t2313", "ATtiny2313"));
        mmcList.add(new MMCDevice("t24", "ATtiny24"));
        mmcList.add(new MMCDevice("t25", "ATtiny25"));
        mmcList.add(new MMCDevice("t26", "ATtiny26"));
        mmcList.add(new MMCDevice("t261", "ATtiny261"));
        mmcList.add(new MMCDevice("t4", "ATtiny4"));
        mmcList.add(new MMCDevice("t40", "ATtiny40"));
        mmcList.add(new MMCDevice("t4313", "ATtiny4313"));
        mmcList.add(new MMCDevice("t43u", "ATtiny43u"));
        mmcList.add(new MMCDevice("t44", "ATtiny44"));
        mmcList.add(new MMCDevice("t45", "ATtiny45"));
        mmcList.add(new MMCDevice("t461", "ATtiny461"));
        mmcList.add(new MMCDevice("t5", "ATtiny5"));
        mmcList.add(new MMCDevice("t84", "ATtiny84"));
        mmcList.add(new MMCDevice("t85", "ATtiny85"));
        mmcList.add(new MMCDevice("t861", "ATtiny861"));
        mmcList.add(new MMCDevice("t88", "ATtiny88"));
        mmcList.add(new MMCDevice("t9", "ATtiny9"));
        mmcList.add(new MMCDevice("x128a1", "ATxmega128A1"));
        mmcList.add(new MMCDevice("x128a1d", "ATxmega128A1revD"));
        mmcList.add(new MMCDevice("x128a1u", "ATxmega128A1U"));
        mmcList.add(new MMCDevice("x128a3", "ATxmega128A3"));
        mmcList.add(new MMCDevice("x128a3u", "ATxmega128A3U"));
        mmcList.add(new MMCDevice("x128a4", "ATxmega128A4"));
        mmcList.add(new MMCDevice("x128a4u", "ATxmega128A4U"));
        mmcList.add(new MMCDevice("x128b1", "ATxmega128B1"));
        mmcList.add(new MMCDevice("x128b3", "ATxmega128B3"));
        mmcList.add(new MMCDevice("x128c3", "ATxmega128C3"));
        mmcList.add(new MMCDevice("x128d3", "ATxmega128D3"));
        mmcList.add(new MMCDevice("x128d4", "ATxmega128D4"));
        mmcList.add(new MMCDevice("x16a4", "ATxmega16A4"));
        mmcList.add(new MMCDevice("x16a4u", "ATxmega16A4U"));
        mmcList.add(new MMCDevice("x16c4", "ATxmega16C4"));
        mmcList.add(new MMCDevice("x16d4", "ATxmega16D4"));
        mmcList.add(new MMCDevice("x16e5", "ATxmega16E5"));
        mmcList.add(new MMCDevice("x192a1", "ATxmega192A1"));
        mmcList.add(new MMCDevice("x192a3", "ATxmega192A3"));
        mmcList.add(new MMCDevice("x192a3u", "ATxmega192A3U"));
        mmcList.add(new MMCDevice("x192c3", "ATxmega192C3"));
        mmcList.add(new MMCDevice("x192d3", "ATxmega192D3"));
        mmcList.add(new MMCDevice("x256a1", "ATxmega256A1"));
        mmcList.add(new MMCDevice("x256a3", "ATxmega256A3"));
        mmcList.add(new MMCDevice("x256a3b", "ATxmega256A3B"));
        mmcList.add(new MMCDevice("x256a3bu", "ATxmega256A3BU"));
        mmcList.add(new MMCDevice("x256a3u", "ATxmega256A3U"));
        mmcList.add(new MMCDevice("x256c3", "ATxmega256C3"));
        mmcList.add(new MMCDevice("x256d3", "ATxmega256D3"));
        mmcList.add(new MMCDevice("x32a4", "ATxmega32A4"));
        mmcList.add(new MMCDevice("x32a4u", "ATxmega32A4U"));
        mmcList.add(new MMCDevice("x32c4", "ATxmega32C4"));
        mmcList.add(new MMCDevice("x32d4", "ATxmega32D4"));
        mmcList.add(new MMCDevice("x32e5", "ATxmega32E5"));
        mmcList.add(new MMCDevice("x384c3", "ATxmega384C3"));
        mmcList.add(new MMCDevice("x384d3", "ATxmega384D3"));
        mmcList.add(new MMCDevice("x64a1", "ATxmega64A1"));
        mmcList.add(new MMCDevice("x64a1u", "ATxmega64A1U"));
        mmcList.add(new MMCDevice("x64a3", "ATxmega64A3"));
        mmcList.add(new MMCDevice("x64a3u", "ATxmega64A3U"));
        mmcList.add(new MMCDevice("x64a4", "ATxmega64A4"));
        mmcList.add(new MMCDevice("x64a4u", "ATxmega64A4U"));
        mmcList.add(new MMCDevice("x64b1", "ATxmega64B1"));
        mmcList.add(new MMCDevice("x64b3", "ATxmega64B3"));
        mmcList.add(new MMCDevice("x64c3", "ATxmega64C3"));
        mmcList.add(new MMCDevice("x64d3", "ATxmega64D3"));
        mmcList.add(new MMCDevice("x64d4", "ATxmega64D4"));
        mmcList.add(new MMCDevice("x8e5", "ATxmega8E5"));
    }

    private void loadProgDevices(LinkedList<ProgrammerDevice> progList) {
        progList.add(new ProgrammerDevice("2232HIO", "FT2232H based generic programmer"));
        progList.add(new ProgrammerDevice("4232h", "FT4232H based generic programmer"));
        progList.add(new ProgrammerDevice("89isp", "Atmel at89isp cable"));
        progList.add(new ProgrammerDevice("abcmini", "ABCmini Board, aka Dick Smith HOTCHIP"));
        progList.add(new ProgrammerDevice("alf", "Nightshade ALF-PgmAVR, http://nightshade.homeip.net/"));
        progList.add(new ProgrammerDevice("arduino", "Arduino"));
        progList.add(new ProgrammerDevice("arduino-ft232r", "Arduino: FT232R connected to ISP"));
        progList.add(new ProgrammerDevice("atisp", "AT-ISP V1.1 programming cable for AVR-SDK1 from <http://micro-research.co.th/> "));
        progList.add(new ProgrammerDevice("atmelice", "Atmel-ICE (ARM/AVR) in JTAG mode"));
        progList.add(new ProgrammerDevice("atmelice_dw", "Atmel-ICE (ARM/AVR) in debugWIRE mode"));
        progList.add(new ProgrammerDevice("atmelice_isp", "Atmel-ICE (ARM/AVR) in ISP mode"));
        progList.add(new ProgrammerDevice("atmelice_pdi", "Atmel-ICE (ARM/AVR) in PDI mode"));
        progList.add(new ProgrammerDevice("avr109", "Atmel AppNote AVR109 Boot Loader"));
        progList.add(new ProgrammerDevice("avr910", "Atmel Low Cost Serial Programmer"));
        progList.add(new ProgrammerDevice("avr911", "Atmel AppNote AVR911 AVROSP"));
        progList.add(new ProgrammerDevice("avrftdi", "FT2232D based generic programmer"));
        progList.add(new ProgrammerDevice("avrisp", "Atmel AVR ISP"));
        progList.add(new ProgrammerDevice("avrisp2", "Atmel AVR ISP mkII"));
        progList.add(new ProgrammerDevice("avrispmkII", "Atmel AVR ISP mkII"));
        progList.add(new ProgrammerDevice("avrispv2", "Atmel AVR ISP V2"));
        progList.add(new ProgrammerDevice("bascom", "Bascom SAMPLE programming cable"));
        progList.add(new ProgrammerDevice("blaster", "Altera ByteBlaster"));
        progList.add(new ProgrammerDevice("bsd", "Brian Dean's Programmer, http://www.bsdhome.com/avrdude/"));
        progList.add(new ProgrammerDevice("buspirate", "The Bus Pirate"));
        progList.add(new ProgrammerDevice("buspirate_bb", "The Bus Pirate (bitbang interface, supports TPI)"));
        progList.add(new ProgrammerDevice("butterfly", "Atmel Butterfly Development Board"));
        progList.add(new ProgrammerDevice("butterfly_mk", "Mikrokopter.de Butterfly"));
        progList.add(new ProgrammerDevice("bwmega", "BitWizard ftdi_atmega builtin programmer"));
        progList.add(new ProgrammerDevice("C232HM", "FT232H based module from FTDI and Glyn.com.au"));
        progList.add(new ProgrammerDevice("c2n232i", "serial port banging, reset"));
        progList.add(new ProgrammerDevice("dapa", "Direct AVR Parallel Access cable"));
        progList.add(new ProgrammerDevice("dasa", "serial port banging, reset"));
        progList.add(new ProgrammerDevice("dasa3", "serial port banging, reset"));
        progList.add(new ProgrammerDevice("diecimila", "alias for arduino-ft232r"));
        progList.add(new ProgrammerDevice("dragon_dw", "Atmel AVR Dragon in debugWire mode"));
        progList.add(new ProgrammerDevice("dragon_hvsp", "Atmel AVR Dragon in HVSP mode"));
        progList.add(new ProgrammerDevice("dragon_isp", "Atmel AVR Dragon in ISP mode"));
        progList.add(new ProgrammerDevice("dragon_jtag", "Atmel AVR Dragon in JTAG mode"));
        progList.add(new ProgrammerDevice("dragon_pdi", "Atmel AVR Dragon in PDI mode"));
        progList.add(new ProgrammerDevice("dragon_pp", "Atmel AVR Dragon in PP mode"));
        progList.add(new ProgrammerDevice("dt006", "Dontronics DT006"));
        progList.add(new ProgrammerDevice("ere-isp-avr", "ERE ISP-AVR <http://www.ere.co.th/download/sch050713.pdf>"));
        progList.add(new ProgrammerDevice("flip1", "FLIP USB DFU protocol version 1 (doc7618)"));
        progList.add(new ProgrammerDevice("flip2", "FLIP USB DFU protocol version 2 (AVR4023)"));
        progList.add(new ProgrammerDevice("frank-stk200", "Frank STK200"));
        progList.add(new ProgrammerDevice("ft232r", "FT232R Synchronous BitBang"));
        progList.add(new ProgrammerDevice("ft245r", "FT245R Synchronous BitBang"));
        progList.add(new ProgrammerDevice("futurlec", "Futurlec.com programming cable."));
        progList.add(new ProgrammerDevice("jtag1", "Atmel JTAG ICE (mkI)"));
        progList.add(new ProgrammerDevice("jtag1slow", "Atmel JTAG ICE (mkI)"));
        progList.add(new ProgrammerDevice("jtag2", "Atmel JTAG ICE mkII"));
        progList.add(new ProgrammerDevice("jtag2avr32", "Atmel JTAG ICE mkII im AVR32 mode"));
        progList.add(new ProgrammerDevice("jtag2dw", "Atmel JTAG ICE mkII in debugWire mode"));
        progList.add(new ProgrammerDevice("jtag2fast", "Atmel JTAG ICE mkII"));
        progList.add(new ProgrammerDevice("jtag2isp", "Atmel JTAG ICE mkII in ISP mode"));
        progList.add(new ProgrammerDevice("jtag2pdi", "Atmel JTAG ICE mkII PDI mode"));
        progList.add(new ProgrammerDevice("jtag2slow", "Atmel JTAG ICE mkII"));
        progList.add(new ProgrammerDevice("jtag3", "Atmel AVR JTAGICE3 in JTAG mode"));
        progList.add(new ProgrammerDevice("jtag3dw", "Atmel AVR JTAGICE3 in debugWIRE mode"));
        progList.add(new ProgrammerDevice("jtag3isp", "Atmel AVR JTAGICE3 in ISP mode"));
        progList.add(new ProgrammerDevice("jtag3pdi", "Atmel AVR JTAGICE3 in PDI mode"));
        progList.add(new ProgrammerDevice("jtagkey", "Amontec JTAGKey, JTAGKey-Tiny and JTAGKey2"));
        progList.add(new ProgrammerDevice("jtagmkI", "Atmel JTAG ICE (mkI)"));
        progList.add(new ProgrammerDevice("jtagmkII", "Atmel JTAG ICE mkII"));
        progList.add(new ProgrammerDevice("jtagmkII_avr32", "Atmel JTAG ICE mkII im AVR32 mode"));
        progList.add(new ProgrammerDevice("lm3s811", "Luminary Micro LM3S811 Eval Board (Rev. A)"));
        progList.add(new ProgrammerDevice("mib510", "Crossbow MIB510 programming board"));
        progList.add(new ProgrammerDevice("mkbutterfly", "Mikrokopter.de Butterfly"));
        progList.add(new ProgrammerDevice("nibobee", "NIBObee"));
        progList.add(new ProgrammerDevice("o-link", "O-Link, OpenJTAG from www.100ask.net"));
        progList.add(new ProgrammerDevice("openmoko", "Openmoko debug board (v3)"));
        progList.add(new ProgrammerDevice("pavr", "Jason Kyle's pAVR Serial Programmer"));
        progList.add(new ProgrammerDevice("pickit2", "MicroChip's PICkit2 Programmer"));
        progList.add(new ProgrammerDevice("picoweb", "Picoweb Programming Cable, http://www.picoweb.net/"));
        progList.add(new ProgrammerDevice("pony-stk200", "Pony Prog STK200"));
        progList.add(new ProgrammerDevice("ponyser", "design ponyprog serial, reset"));
        progList.add(new ProgrammerDevice("siprog", "Lancos SI-Prog <http://www.lancos.com/siprogsch.html>"));
        progList.add(new ProgrammerDevice("sp12", "Steve Bolt's Programmer"));
        progList.add(new ProgrammerDevice("stk200", "STK200"));
        progList.add(new ProgrammerDevice("stk500", "Atmel STK500"));
        progList.add(new ProgrammerDevice("stk500hvsp", "Atmel STK500 V2 in high-voltage serial programming mode"));
        progList.add(new ProgrammerDevice("stk500pp", "Atmel STK500 V2 in parallel programming mode"));
        progList.add(new ProgrammerDevice("stk500v1", "Atmel STK500 Version 1.x firmware"));
        progList.add(new ProgrammerDevice("stk500v2", "Atmel STK500 Version 2.x firmware"));
        progList.add(new ProgrammerDevice("stk600", "Atmel STK600"));
        progList.add(new ProgrammerDevice("stk600hvsp", "Atmel STK600 in high-voltage serial programming mode"));
        progList.add(new ProgrammerDevice("stk600pp", "Atmel STK600 in parallel programming mode"));
        progList.add(new ProgrammerDevice("UM232H", "FT232H based module from FTDI and Glyn.com.au"));
        progList.add(new ProgrammerDevice("usbasp", "USBasp, http://www.fischl.de/usbasp/"));
        progList.add(new ProgrammerDevice("usbasp-clone", "Any usbasp clone with correct VID/PID"));
        progList.add(new ProgrammerDevice("usbtiny", "USBtiny simple USB programmer, http://www.ladyada.net/make/usbtinyisp/"));
        progList.add(new ProgrammerDevice("wiring", "Wiring"));
        progList.add(new ProgrammerDevice("xil", "Xilinx JTAG cable"));
        progList.add(new ProgrammerDevice("xplainedpro", "Atmel AVR XplainedPro in JTAG mode"));
    }
}
