# boot -v of Ubuntu QEMU VM with HP 331T Broadcom bge (all 4 ports) passed through and Virtual NIC removed.

Copyright (c) 1992-2023 The FreeBSD Project.
Copyright (c) 1979, 1980, 1983, 1986, 1988, 1989, 1991, 1992, 1993, 1994
	The Regents of the University of California. All rights reserved.
FreeBSD is a registered trademark of The FreeBSD Foundation.
FreeBSD 14.0-CURRENT amd64 1400094 #1 RELENG_2_7_2-n255948-8d2b56da39c: Wed Dec  6 20:45:47 UTC 2023
    root@freebsd:/var/jenkins/workspace/pfSense-CE-snapshots-2_7_2-main/obj/amd64/StdASW5b/var/jenkins/workspace/pfSense-CE-snapshots-2_7_2-main/sources/FreeBSD-src-RELENG_2_7_2/amd64.amd64/sys/pfSense amd64
FreeBSD clang version 16.0.6 (https://github.com/llvm/llvm-project.git llvmorg-16.0.6-0-g7cbf1a259152)
PPIM 0: PA=0xb8000, VA=0xffffffff84410000, size=0x8000, mode=0
pmap: large map 8 PML4 slots (4096 GB)
VT(vga): text 80x25
Preloaded elf kernel "/boot/kernel/kernel" at 0xffffffff83c6a540.
Preloaded boot_entropy_cache "/boot/entropy" at 0xffffffff83c73830.
Preloaded elf obj module "/boot/kernel/opensolaris.ko" at 0xffffffff83c73888.
Preloaded elf obj module "/boot/kernel/zfs.ko" at 0xffffffff83c73ef8.
Preloaded TSLOG data "TSLOG" at 0xffffffff83c74760.
Early TSC frequency 3096107870Hz calibrated from 8254 PIT
CPU: Intel(R) Core(TM) i3-8100T CPU @ 3.10GHz (3096.11-MHz K8-class CPU)
  Origin="GenuineIntel"  Id=0x906eb  Family=0x6  Model=0x9e  Stepping=11
  Features=0xf83fbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,MMX,FXSR,SSE,SSE2,SS>
  Features2=0xfffab223<SSE3,PCLMULQDQ,VMX,SSSE3,FMA,CX16,PDCM,PCID,SSE4.1,SSE4.2,x2APIC,MOVBE,POPCNT,TSCDLT,AESNI,XSAVE,OSXSAVE,AVX,F16C,RDRAND,HV>
  AMD Features=0x2c100800<SYSCALL,NX,Page1GB,RDTSCP,LM>
  AMD Features2=0x121<LAHF,ABM,Prefetch>
  Structured Extended Features=0x9c47ab<FSGSBASE,TSCADJ,BMI1,AVX2,SMEP,BMI2,ERMS,INVPCID,MPX,RDSEED,ADX,SMAP,CLFLUSHOPT>
  Structured Extended Features2=0x4<UMIP>
  Structured Extended Features3=0xac000400<MD_CLEAR,IBPB,STIBP,ARCH_CAP,SSBD>
  XSAVE Features=0xf<XSAVEOPT,XSAVEC,XINUSE,XSAVES>
  IA32_ARCH_CAPS=0x4c<RSBA,SKIP_L1DFL_VME>
  AMD Extended Feature Extensions ID EBX=0x100d000<IBPB,IBRS,STIBP,SSBD>
  VT-x: Basic Features=0xd81000<INS/OUTS,TRUE>
        Pin-Based Controls=0x7f<ExtINT,NMI,VNMI,PreTmr>
        Primary Processor Controls=0xfff9fffe<INTWIN,TSCOff,HLT,INVLPG,MWAIT,RDPMC,RDTSC,CR3-LD,CR3-ST,CR8-LD,CR8-ST,TPR,NMIWIN,MOV-DR,IO,IOmap,MTF,MSRmap,MONITOR,PAUSE>
        Secondary Processor Controls=0x1378ff<APIC,EPT,DT,RDTSCP,x2APIC,VPID,WBINVD,UG,RDRAND,INVPCID,VMFUNC,VMCS,XSAVES>
        Exit Controls=0xd81000<PERF,PAT-LD,EFER-SV,PTMR-SV>
        Entry Controls=0xd81000
        EPT Features=0x6334041<XO,PW4,WB,2M,1G,INVEPT,AD,single,all>
        VPID Features=0xf01<INVVPID,individual,single,all,single-globals>
3rd-level cache: 16MByte, 16-way set associative, 64 byte line size
2nd-level cache: 2-MB, 8-way set associative, 64-byte line size
1st-level instruction cache: 32 KB, 8-way set associative, 64 byte line size
1st-level data cache: 32 KB, 8-way set associative, 64 byte line size
L2 cache: 512 kbytes, 16-way associative, 64 bytes/line
Hypervisor: Origin = "KVMKVMKVM"
real memory  = 8589934592 (8192 MB)
Physical memory chunk(s):
0x0000000000001000 - 0x000000000009efff, 647168 bytes (158 pages)
0x0000000000100000 - 0x00000000001fffff, 1048576 bytes (256 pages)
0x0000000004001000 - 0x00000000bffd7fff, 3153948672 bytes (770007 pages)
0x0000000100001000 - 0x000000023134bfff, 5120503808 bytes (1250123 pages)
0x000000023fe00000 - 0x000000023ffa7fff, 1736704 bytes (424 pages)
avail memory = 8248672256 (7866 MB)
MADT: Found CPU APIC ID 0 ACPI ID 0: enabled
SMP: Added CPU 0 (AP)
MADT: Found CPU APIC ID 1 ACPI ID 1: enabled
SMP: Added CPU 1 (AP)
Event timer "LAPIC" quality 600
ACPI APIC Table: <BOCHS  BXPC    >
Package ID shift: 0
L3 cache ID shift: 0
L2 cache ID shift: 0
L1 cache ID shift: 0
AP boot address 0x1000
INTR: Adding local APIC 1 as a target
FreeBSD/SMP: Multiprocessor System Detected: 2 CPUs
FreeBSD/SMP: 2 package(s) x 1 core(s)
Package HW ID = 0
		CPU0 (BSP): APIC ID: 0
Package HW ID = 1
		CPU1 (AP): APIC ID: 1
APIC: CPU 0 has ACPI ID 0
APIC: CPU 1 has ACPI ID 1
x86bios:  IVT 0x000000-0x0004ff at 0xfffff80000000000
x86bios: SSEG 0x09e000-0x09efff at 0xfffffe00103ef000
x86bios: EBDA 0x09f000-0x09ffff at 0xfffff8000009f000
x86bios:  ROM 0x0a0000-0x0fefff at 0xfffff800000a0000
Pentium Pro MTRR support enabled
random: registering fast source Intel Secure Key RNG
random: fast provider: "Intel Secure Key RNG"
random: read 4096 bytes from preloaded cache
random: no platform bootloader entropy
random: unblocking device.
VIMAGE (virtualized network stack) enabled
hostuuid: using 00000000-0000-0000-0000-000000000000
ULE: setup cpu 0
ULE: setup cpu 1
ACPI: RSDP 0x00000000000F5910 000014 (v00 BOCHS )
ACPI: RSDT 0x00000000BFFE1820 000030 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
ACPI: FACP 0x00000000BFFE1704 000074 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
ACPI: DSDT 0x00000000BFFE0040 0016C4 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
ACPI: FACS 0x00000000BFFE0000 000040
ACPI: APIC 0x00000000BFFE1778 000080 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
ACPI: WAET 0x00000000BFFE17F8 000028 (v01 BOCHS  BXPC     00000001 BXPC 00000001)
MADT: Found IO APIC ID 0, Interrupt 0 at 0xfec00000
ioapic0: ver 0x11 maxredir 0x17
ioapic0: Routing external 8259A's -> intpin 0
MADT: Interrupt override: source 0, irq 2
ioapic0: Routing IRQ 0 -> intpin 2
MADT: Interrupt override: source 5, irq 5
ioapic0: intpin 5 trigger: level
MADT: Interrupt override: source 9, irq 9
ioapic0: intpin 9 trigger: level
MADT: Interrupt override: source 10, irq 10
ioapic0: intpin 10 trigger: level
MADT: Interrupt override: source 11, irq 11
ioapic0: intpin 11 trigger: level
lapic: Routing NMI -> LINT1
lapic: LINT1 trigger: edge
lapic: LINT1 polarity: high
ioapic0 <Version 1.1> irqs 0-23
cpu0 BSP:
     ID: 0x00000000   VER: 0x00050014 LDR: 0x00000001 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000001ff
  timer: 0x000100ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
SMP: AP CPU #1 Launched!
cpu1 AP:
     ID: 0x00000001   VER: 0x00050014 LDR: 0x00000002 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000001ff
  timer: 0x000100ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
TSC timecounter disables C2 and C3.
TSC timecounter discards lower 1 bit(s)
TCP_ratelimit: Is now initialized
firmware: 'iwm7265Dfw' version 0: 1383604 bytes loaded at 0xffffffff81f14faa
firmware: 'iwm8000Cfw' version 0: 2351636 bytes loaded at 0xffffffff82066c5e
firmware: 'rtwn-rtl8188eefw' version 111: 11216 bytes loaded at 0xffffffff82ace5ce
firmware: 'rtwn-rtl8188eufw' version 111: 13904 bytes loaded at 0xffffffff82ad119e
firmware: 'rtwn-rtl8192cfwE' version 111: 14818 bytes loaded at 0xffffffff82ad47ee
firmware: 'wpifw' version 153229: 150100 bytes loaded at 0xffffffff82b1a392
firmware: 'rtwn-rtl8192cfwE_B' version 111: 16332 bytes loaded at 0xffffffff82ad81d0
firmware: 'rtwn-rtl8192cfwT' version 111: 16126 bytes loaded at 0xffffffff82adc19c
firmware: 'rtwn-rtl8192cfwU' version 111: 16126 bytes loaded at 0xffffffff82ae009a
firmware: 'rtwn-rtl8192eufw' version 111: 31818 bytes loaded at 0xffffffff82ae3f98
firmware: 'rtwn-rtl8812aufw' version 111: 32060 bytes loaded at 0xffffffff82aebbe2
firmware: 'rtwn-rtl8821aufw' version 111: 27804 bytes loaded at 0xffffffff82af391e
firmware: 'iwm8265fw' version 0: 1811984 bytes loaded at 0xffffffff822a4e72
firmware: 'iwn1000fw' version 0: 337520 bytes loaded at 0xffffffff8245f482
firmware: 'iwn100fw' version 0: 337572 bytes loaded at 0xffffffff824b1af2
firmware: 'iwn105fw' version 0: 689680 bytes loaded at 0xffffffff82504196
firmware: 'iwn135fw' version 0: 701228 bytes loaded at 0xffffffff825ac7a6
firmware: 'iwn2000fw' version 0: 695876 bytes loaded at 0xffffffff82657ad2
firmware: 'iwn2030fw' version 0: 707392 bytes loaded at 0xffffffff82701916
firmware: 'iwn4965fw' version 0: 187972 bytes loaded at 0xffffffff827ae456
snd_unit_init() u=0x00ff8000 [512] d=0x00007c00 [32] c=0x000003ff [1024]
feeder_register: snd_unit=-1 snd_maxautovchans=16 latency=2 feeder_rate_min=1 feeder_rate_max=2016000 feeder_rate_round=25
firmware: 'mw88W8363fw' version 0: 94940 bytes loaded at 0xffffffff82aaea0a
firmware: 'mwlboot' version 0: 2280 bytes loaded at 0xffffffff82ac5ce6
firmware: 'mxge_eth_z8e' version 377284: 120629 bytes loaded at 0xffffffff82c4f870
firmware: 'mxge_ethp_z8e' version 387604: 121317 bytes loaded at 0xffffffff82c6d060
firmware: 'mxge_rss_eth_z8e' version 534724: 151912 bytes loaded at 0xffffffff82c8ab00
firmware: 'mxge_rss_ethp_z8e' version 544468: 152837 bytes loaded at 0xffffffff82cafd20
wlan: mac acl policy registered
firmware: 'iwn5000fw' version 0: 340696 bytes loaded at 0xffffffff827dc29a
firmware: 'iwn5150fw' version 0: 337400 bytes loaded at 0xffffffff8282f572
firmware: 'iwn6000fw' version 0: 454608 bytes loaded at 0xffffffff82881b6a
firmware: 'iwn6000g2afw' version 0: 677296 bytes loaded at 0xffffffff828f0b3a
firmware: 'iwn6000g2bfw' version 0: 679436 bytes loaded at 0xffffffff829960ea
firmware: 'iwn6050fw' version 0: 469780 bytes loaded at 0xffffffff82a3bef6
firmware: 't4fw_cfg' version 0: 4523 bytes loaded at 0xffffffff81803e30
firmware: 't4fw_cfg_uwire' version 0: 21433 bytes loaded at 0xffffffff81804fdb
firmware: 't4fw' version 0: 570880 bytes loaded at 0xffffffff8180a394
wlan: <802.11 Link Layer>
firmware: 't5fw_cfg' version 0: 5902 bytes loaded at 0xffffffff81895994
firmware: 't5fw_cfg_uwire' version 0: 21859 bytes loaded at 0xffffffff818970a2
firmware: 't5fw' version 0: 678912 bytes loaded at 0xffffffff8189c605
firmware: 't6fw_cfg' version 0: 5960 bytes loaded at 0xffffffff81942205
firmware: 't6fw_cfg_uwire' version 0: 22693 bytes loaded at 0xffffffff8194394d
firmware: 't6fw' version 0: 730624 bytes loaded at 0xffffffff819491f2
firmware: 'rsu-rtl8712fw' version 120: 122328 bytes loaded at 0xffffffff82afa5ba
firmware: 'runfw' version 0: 8192 bytes loaded at 0xffffffff82b18392
ipw_bss: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw.LICENSE.
ipw_bss: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_bss_fw, 0xffffffff807475a0, 0) error 1
ipw_ibss: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw.LICENSE.
ipw_ibss: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_ibss_fw, 0xffffffff80747650, 0) error 1
ipw_monitor: You need to read the LICENSE file in /usr/share/doc/legal/intel_ipw.LICENSE.
ipw_monitor: If you agree with the license, set legal.intel_ipw.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (ipw_monitor_fw, 0xffffffff80747700, 0) error 1
iwi_bss: You need to read the LICENSE file in /usr/share/doc/legal/intel_iwi.LICENSE.
iwi_bss: If you agree with the license, set legal.intel_iwi.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (iwi_bss_fw, 0xffffffff80765180, 0) error 1
iwi_ibss: You need to read the LICENSE file in /usr/share/doc/legal/intel_iwi.LICENSE.
iwi_ibss: If you agree with the license, set legal.intel_iwi.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (iwi_ibss_fw, 0xffffffff80765230, 0) error 1
firmware: 'rt2561fw' version 0: 8192 bytes loaded at 0xffffffff82ac65ce
firmware: 'rt2561sfw' version 0: 8192 bytes loaded at 0xffffffff82ac85ce
firmware: 'rt2661fw' version 0: 8192 bytes loaded at 0xffffffff82aca5ce
firmware: 'rt2860fw' version 0: 8192 bytes loaded at 0xffffffff82acc5ce
iwi_monitor: You need to read the LICENSE file in /usr/share/doc/legal/intel_iwi.LICENSE.
iwi_monitor: If you agree with the license, set legal.intel_iwi.license_ack=1 in /boot/loader.conf.
module_register_init: MOD_LOAD (iwi_monitor_fw, 0xffffffff807652e0, 0) error 1
firmware: 'iwm3160fw' version 0: 918268 bytes loaded at 0xffffffff81b196f6
random: entropy device external interface
firmware: 'iwm3168fw' version 0: 1028032 bytes loaded at 0xffffffff81bf99f2
firmware: 'iwm7260fw' version 0: 1049340 bytes loaded at 0xffffffff81cf49b2
firmware: 'iwm7265fw' version 0: 1180412 bytes loaded at 0xffffffff81df4cae
EFI systbl not available
[ath_hal] loaded
kbd: new array size 4
kbd1 at kbdmux0
mem: <memory>
crypto: <crypto core>
null: <full device, null device, zero device>
io: <I/O>
tcp_log: tcp_log device
WARNING: Device "spkr" is Giant locked and may be deleted before FreeBSD 14.0.
netgate0: <QEMU Guest>
kvmclock0: <KVM paravirtual clock>
Timecounter "kvmclock" frequency 1000000000 Hz quality 975
kvmclock0: registered as a time-of-day clock, resolution 0.000001s
vtvga0: <VT VGA driver>
smbios0: <System Management BIOS> at iomem 0xf5930-0xf594e
smbios0: Version: 2.8, BCD Revision: 2.8
crypto: assign cryptosoft0 driver id 0, flags 0x6000000
acpi0: <BOCHS BXPC>
ACPI: 1 ACPI AML tables successfully acquired and loaded
ioapic0: routing intpin 9 (ISA IRQ 9) to lapic 0 vector 48
acpi0: Power Button (fixed)
acpi0: wakeup code va 0xfffffe00105dd000 pa 0x1000
cpu0: <ACPI CPU> on acpi0
cpu0: switching to generic Cx mode
cpu1: <ACPI CPU> on acpi0
atrtc0: <AT realtime clock> port 0x70-0x77 irq 8 on acpi0
atrtc0: registered as a time-of-day clock, resolution 1.000000s
ioapic0: routing intpin 8 (ISA IRQ 8) to lapic 1 vector 48
ioapic0: routing intpin 8 (ISA IRQ 8) to lapic 0 vector 49
Event timer "RTC" frequency 32768 Hz quality 0
ACPI timer: -> 10
Timecounter "ACPI-fast" frequency 3579545 Hz quality 900
acpi_timer0: <24-bit timer at 3.579545MHz> port 0x608-0x60b on acpi0
pci_link0:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0   10   N     0  5 10 11
  Validation          0   10   N     0  5 10 11
  After Disable       0  255   N     0  5 10 11
pci_link1:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0   10   N     0  5 10 11
  Validation          0   10   N     0  5 10 11
  After Disable       0  255   N     0  5 10 11
pci_link2:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0   11   N     0  5 10 11
  Validation          0   11   N     0  5 10 11
  After Disable       0  255   N     0  5 10 11
pci_link3:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0   11   N     0  5 10 11
  Validation          0   11   N     0  5 10 11
  After Disable       0  255   N     0  5 10 11
pci_link4:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0    9   N     0  9
  Validation          0    9   N     0  9
  After Disable       0  255   N     0  9
pcib0: <ACPI Host-PCI bridge> port 0xcf8-0xcff on acpi0
pcib0: decoding 5 range 0-0xff
pcib0: decoding 4 range 0-0xcf7
pcib0: decoding 4 range 0xd00-0xffff
pcib0: decoding 3 range 0xa0000-0xbffff
pcib0: decoding 3 range 0xc0000000-0xfebfffff
pcib0: decoding 3 range 0x240000000-0x2bfffffff
ACPI: Found matching pin for 0.1.INTA at func 3: 9
ACPI: Found matching pin for 0.3.INTA at func 0: 11
ACPI: Found matching pin for 0.3.INTB at func 1: 11
ACPI: Found matching pin for 0.3.INTC at func 2: 10
ACPI: Found matching pin for 0.3.INTD at func 7: 10
ACPI: Found matching pin for 0.5.INTA at func 0: 10
ACPI: Found matching pin for 0.6.INTA at func 0: 10
ACPI: Found matching pin for 0.7.INTB at func 0: 11
ACPI: Found matching pin for 0.8.INTA at func 0: 11
ACPI: Found matching pin for 0.9.INTB at func 0: 10
ACPI: Found matching pin for 0.10.INTA at func 0: 10
pci0: <ACPI PCI bus> on pcib0
pci0: domain=0, physical bus=0
found->	vendor=0x8086, dev=0x1237, revid=0x02
	domain=0, bus=0, slot=0, func=0
	class=06-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0000, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
found->	vendor=0x8086, dev=0x7000, revid=0x00
	domain=0, bus=0, slot=1, func=0
	class=06-01-00, hdrtype=0x00, mfdev=1
	cmdreg=0x0103, statreg=0x0200, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
found->	vendor=0x8086, dev=0x7010, revid=0x00
	domain=0, bus=0, slot=1, func=1
	class=01-01-80, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0280, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
pcib0: allocated type 4 (0x1f0-0x1f7) for rid 10 of pci0:0:1:1
pcib0: allocated type 4 (0x3f6-0x3f6) for rid 14 of pci0:0:1:1
pcib0: allocated type 4 (0x170-0x177) for rid 18 of pci0:0:1:1
pcib0: allocated type 4 (0x376-0x376) for rid 1c of pci0:0:1:1
	map[20]: type I/O Port, range 32, base 0xc120, size  4, enabled
pcib0: allocated type 4 (0xc120-0xc12f) for rid 20 of pci0:0:1:1
found->	vendor=0x8086, dev=0x7113, revid=0x03
	domain=0, bus=0, slot=1, func=3
	class=06-80-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0280, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=9
pcib0: matched entry for 0.1.INTA (src \134_SB_.LNKS:0)
pcib0: slot 1 INTA routed to irq 9 via \134_SB_.LNKS
found->	vendor=0x8086, dev=0x2934, revid=0x03
	domain=0, bus=0, slot=3, func=0
	class=0c-03-00, hdrtype=0x00, mfdev=1
	cmdreg=0x0107, statreg=0x0000, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=11
	map[20]: type I/O Port, range 32, base 0xc0c0, size  5, enabled
pcib0: allocated type 4 (0xc0c0-0xc0df) for rid 20 of pci0:0:3:0
pcib0: matched entry for 0.3.INTA (src \134_SB_.LNKC:0)
pcib0: slot 3 INTA routed to irq 11 via \134_SB_.LNKC
found->	vendor=0x8086, dev=0x2935, revid=0x03
	domain=0, bus=0, slot=3, func=1
	class=0c-03-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0107, statreg=0x0000, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=11
	map[20]: type I/O Port, range 32, base 0xc0e0, size  5, enabled
pcib0: allocated type 4 (0xc0e0-0xc0ff) for rid 20 of pci0:0:3:1
pcib0: matched entry for 0.3.INTB (src \134_SB_.LNKD:0)
pcib0: slot 3 INTB routed to irq 11 via \134_SB_.LNKD
found->	vendor=0x8086, dev=0x2936, revid=0x03
	domain=0, bus=0, slot=3, func=2
	class=0c-03-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0107, statreg=0x0000, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=c, irq=10
	map[20]: type I/O Port, range 32, base 0xc100, size  5, enabled
pcib0: allocated type 4 (0xc100-0xc11f) for rid 20 of pci0:0:3:2
pcib0: matched entry for 0.3.INTC (src \134_SB_.LNKA:0)
pcib0: slot 3 INTC routed to irq 10 via \134_SB_.LNKA
found->	vendor=0x8086, dev=0x293a, revid=0x03
	domain=0, bus=0, slot=3, func=7
	class=0c-03-20, hdrtype=0x00, mfdev=0
	cmdreg=0x0107, statreg=0x0000, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=d, irq=10
	map[10]: type Memory, range 32, base 0xfeb00000, size 12, enabled
pcib0: allocated type 3 (0xfeb00000-0xfeb00fff) for rid 10 of pci0:0:3:7
pcib0: matched entry for 0.3.INTD (src \134_SB_.LNKB:0)
pcib0: slot 3 INTD routed to irq 10 via \134_SB_.LNKB
found->	vendor=0x1af4, dev=0x1001, revid=0x00
	domain=0, bus=0, slot=5, func=0
	class=01-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0107, statreg=0x0010, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=10
	MSI-X supports 3 messages in map 0x14
	map[10]: type I/O Port, range 32, base 0xc000, size  7, enabled
pcib0: allocated type 4 (0xc000-0xc07f) for rid 10 of pci0:0:5:0
	map[14]: type Memory, range 32, base 0xfeb01000, size 12, enabled
pcib0: allocated type 3 (0xfeb01000-0xfeb01fff) for rid 14 of pci0:0:5:0
	map[20]: type Prefetchable Memory, range 64, base 0xfebf0000, size 14, enabled
pcib0: allocated type 3 (0xfebf0000-0xfebf3fff) for rid 20 of pci0:0:5:0
pcib0: matched entry for 0.5.INTA (src \134_SB_.LNKA:0)
pcib0: slot 5 INTA routed to irq 10 via \134_SB_.LNKA
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=6, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=10
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
	map[10]: type Prefetchable Memory, range 64, base 0xfeb30000, size 16, enabled
pcib0: allocated type 3 (0xfeb30000-0xfeb3ffff) for rid 10 of pci0:0:6:0
	map[18]: type Prefetchable Memory, range 64, base 0xfeb40000, size 16, enabled
pcib0: allocated type 3 (0xfeb40000-0xfeb4ffff) for rid 18 of pci0:0:6:0
	map[20]: type Prefetchable Memory, range 64, base 0xfeb50000, size 16, enabled
pcib0: allocated type 3 (0xfeb50000-0xfeb5ffff) for rid 20 of pci0:0:6:0
pcib0: matched entry for 0.6.INTA (src \134_SB_.LNKB:0)
pcib0: slot 6 INTA routed to irq 10 via \134_SB_.LNKB
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=7, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
	map[10]: type Prefetchable Memory, range 64, base 0xfeb60000, size 16, enabled
pcib0: allocated type 3 (0xfeb60000-0xfeb6ffff) for rid 10 of pci0:0:7:0
	map[18]: type Prefetchable Memory, range 64, base 0xfeb70000, size 16, enabled
pcib0: allocated type 3 (0xfeb70000-0xfeb7ffff) for rid 18 of pci0:0:7:0
	map[20]: type Prefetchable Memory, range 64, base 0xfeb80000, size 16, enabled
pcib0: allocated type 3 (0xfeb80000-0xfeb8ffff) for rid 20 of pci0:0:7:0
pcib0: matched entry for 0.7.INTB (src \134_SB_.LNKD:0)
pcib0: slot 7 INTB routed to irq 11 via \134_SB_.LNKD
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=8, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
	map[10]: type Prefetchable Memory, range 64, base 0xfeb90000, size 16, enabled
pcib0: allocated type 3 (0xfeb90000-0xfeb9ffff) for rid 10 of pci0:0:8:0
	map[18]: type Prefetchable Memory, range 64, base 0xfeba0000, size 16, enabled
pcib0: allocated type 3 (0xfeba0000-0xfebaffff) for rid 18 of pci0:0:8:0
	map[20]: type Prefetchable Memory, range 64, base 0xfebb0000, size 16, enabled
pcib0: allocated type 3 (0xfebb0000-0xfebbffff) for rid 20 of pci0:0:8:0
pcib0: matched entry for 0.8.INTA (src \134_SB_.LNKD:0)
pcib0: slot 8 INTA routed to irq 11 via \134_SB_.LNKD
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=9, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=10
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
	map[10]: type Prefetchable Memory, range 64, base 0xfebc0000, size 16, enabled
pcib0: allocated type 3 (0xfebc0000-0xfebcffff) for rid 10 of pci0:0:9:0
	map[18]: type Prefetchable Memory, range 64, base 0xfebd0000, size 16, enabled
pcib0: allocated type 3 (0xfebd0000-0xfebdffff) for rid 18 of pci0:0:9:0
	map[20]: type Prefetchable Memory, range 64, base 0xfebe0000, size 16, enabled
pcib0: allocated type 3 (0xfebe0000-0xfebeffff) for rid 20 of pci0:0:9:0
pcib0: matched entry for 0.9.INTB (src \134_SB_.LNKB:0)
pcib0: slot 9 INTB routed to irq 10 via \134_SB_.LNKB
found->	vendor=0x1af4, dev=0x1002, revid=0x00
	domain=0, bus=0, slot=10, func=0
	class=00-ff-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0010, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=10
	map[10]: type I/O Port, range 32, base 0xc080, size  6, enabled
pcib0: allocated type 4 (0xc080-0xc0bf) for rid 10 of pci0:0:10:0
	map[20]: type Prefetchable Memory, range 64, base 0xfebf4000, size 14, enabled
pcib0: allocated type 3 (0xfebf4000-0xfebf7fff) for rid 20 of pci0:0:10:0
pcib0: matched entry for 0.10.INTA (src \134_SB_.LNKB:0)
pcib0: slot 10 INTA routed to irq 10 via \134_SB_.LNKB
isab0: <PCI-ISA bridge> at device 1.0 on pci0
isa0: <ISA bus> on isab0
atapci0: <Intel PIIX3 WDMA2 controller> port 0x1f0-0x1f7,0x3f6,0x170-0x177,0x376,0xc120-0xc12f at device 1.1 on pci0
ata0: <ATA channel> at channel 0 on atapci0
ioapic0: routing intpin 14 (ISA IRQ 14) to lapic 0 vector 50
ata1: <ATA channel> at channel 1 on atapci0
ioapic0: routing intpin 15 (ISA IRQ 15) to lapic 1 vector 48
pci0: <bridge> at device 1.3 (no driver attached)
uhci0: <Intel 82801I (ICH9) USB controller> port 0xc0c0-0xc0df irq 11 at device 3.0 on pci0
ioapic0: routing intpin 11 (ISA IRQ 11) to lapic 0 vector 51
usbus0 on uhci0
uhci0: usbpf: Attached
usbus0: 12Mbps Full Speed USB v1.0
uhci1: <Intel 82801I (ICH9) USB controller> port 0xc0e0-0xc0ff irq 11 at device 3.1 on pci0
usbus1 on uhci1
uhci1: usbpf: Attached
usbus1: 12Mbps Full Speed USB v1.0
uhci2: <Intel 82801I (ICH9) USB controller> port 0xc100-0xc11f irq 10 at device 3.2 on pci0
ioapic0: routing intpin 10 (ISA IRQ 10) to lapic 1 vector 49
usbus2 on uhci2
uhci2: usbpf: Attached
usbus2: 12Mbps Full Speed USB v1.0
ehci0: <Intel 82801I (ICH9) USB 2.0 controller> mem 0xfeb00000-0xfeb00fff irq 10 at device 3.7 on pci0
usbus3: EHCI version 1.0
usbus3 on ehci0
ehci0: usbpf: Attached
usbus3: 480Mbps High Speed USB v2.0
virtio_pci0: <VirtIO PCI (legacy) Block adapter> port 0xc000-0xc07f mem 0xfeb01000-0xfeb01fff,0xfebf0000-0xfebf3fff irq 10 at device 5.0 on pci0
vtblk0: <VirtIO Block Adapter> on virtio_pci0
virtio_pci0: host features: 0x79007e54 <RingEventIdx,RingIndirectDesc,AnyLayout,NotifyOnEmpty,WriteZeros,Discard,Multiqueue,ConfigWCE,Topology,FlushCmd,BlockSize,DiskGeometry,MaxNumSegs>
virtio_pci0: negotiated features: 0x10002e54 <RingIndirectDesc,Discard,ConfigWCE,Topology,FlushCmd,BlockSize,DiskGeometry,MaxNumSegs>
virtio_pci0: attempting to allocate 2 MSI-X vectors (3 supported)
msi: routing MSI-X IRQ 24 to local APIC 0 vector 52
msi: routing MSI-X IRQ 25 to local APIC 1 vector 50
virtio_pci0: using IRQs 24-25 for MSI-X
virtio_pci0: using per VQ MSIX interrupts
vtblk0: 16384MB (33554432 512 byte sectors)
GEOM: new disk vtbd0
bge0: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb30000-0xfeb3ffff,0xfeb40000-0xfeb4ffff,0xfeb50000-0xfeb5ffff irq 10 at device 6.0 on pci0
bge0: APE FW version: NCSI v1.4.22.0
bge0: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 26 to local APIC 0 vector 53
bge0: using IRQ 26 for MSI
bge0: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge0: Disabling fastboot
miibus0: <MII bus> on bge0
brgphy0: <BCM5719C 1000BASE-T media interface> PHY 1 on miibus0
brgphy0: OUI 0x001be9, model 0x0022, rev. 0
brgphy0:  10baseT, 10baseT-FDX, 100baseTX, 100baseTX-FDX, 1000baseT, 1000baseT-master, 1000baseT-FDX, 1000baseT-FDX-master, auto, auto-flow
bge0: Using defaults for TSO: 65518/35/2048
bge0: bpf attached
bge0: Ethernet address: 98:f2:b3:03:f1:74
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb60000-0xfeb6ffff,0xfeb70000-0xfeb7ffff,0xfeb80000-0xfeb8ffff irq 11 at device 7.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 1 vector 51
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb90000-0xfeb9ffff,0xfeba0000-0xfebaffff,0xfebb0000-0xfebbffff irq 11 at device 8.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 0 vector 54
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfebc0000-0xfebcffff,0xfebd0000-0xfebdffff,0xfebe0000-0xfebeffff irq 10 at device 9.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 1 vector 51
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
virtio_pci1: <VirtIO PCI (legacy) Balloon adapter> port 0xc080-0xc0bf mem 0xfebf4000-0xfebf7fff irq 10 at device 10.0 on pci0
vtballoon0: <VirtIO Balloon Adapter> on virtio_pci1
virtio_pci1: host features: 0x79000012 <RingEventIdx,RingIndirectDesc,AnyLayout,NotifyOnEmpty,0x10,StatsVq>
virtio_pci1: negotiated features: 0
virtio_pci1: using legacy interrupt
acpi_syscontainer0: <System Container> on acpi0
acpi_syscontainer1: <System Container> port 0xaf00-0xaf0b on acpi0
acpi_syscontainer2: <System Container> port 0xafe0-0xafe3 on acpi0
acpi_syscontainer3: <System Container> port 0xae00-0xae17 on acpi0
uart0: <16550 or compatible> port 0x3f8-0x3ff irq 4 flags 0x10 on acpi0
uart0: console (115200,n,8,1)
ioapic0: routing intpin 4 (ISA IRQ 4) to lapic 0 vector 54
uart0: fast interrupt
uart0: PPS capture mode: DCD
atkbdc0: <Keyboard controller (i8042)> port 0x60,0x64 irq 1 on acpi0
atkbd0: <AT Keyboard> irq 1 on atkbdc0
atkbd: the current kbd controller command byte 0061
atkbd: keyboard ID 0x41ab (2)
kbdc: RESET_KBD return code:00fa
kbdc: RESET_KBD status:00aa
kbd0 at atkbd0
kbd0: atkbd0, AT 101/102 (2), config:0x0, flags:0x1d0000
ioapic0: routing intpin 1 (ISA IRQ 1) to lapic 1 vector 51
atkbd0: [GIANT-LOCKED]
psm0: unable to allocate IRQ
psmcpnp0: <PS/2 mouse port> irq 12 on acpi0
psm0: current command byte:0061
kbdc: TEST_AUX_PORT status:0000
kbdc: RESET_AUX return code:00fa
kbdc: RESET_AUX status:00aa
kbdc: RESET_AUX ID:0000
kbdc: RESET_AUX return code:00fa
kbdc: RESET_AUX status:00aa
kbdc: RESET_AUX ID:0000
psm: status 00 02 64
psm: status 00 00 64
psm: status 00 03 64
psm: status 00 03 64
psm: data 08 00 00
psm: status 00 02 64
psm0: <PS/2 Mouse> irq 12 on atkbdc0
ioapic0: routing intpin 12 (ISA IRQ 12) to lapic 0 vector 55
psm0: [GIANT-LOCKED]
WARNING: Device "psm" is Giant locked and may be deleted before FreeBSD 14.0.
psm0: model IntelliMouse Explorer, device ID 4-00, 5 buttons
psm0: config:00000000, flags:00000008, packet size:4
psm0: syncmask:08, syncbits:00
fdc0: <floppy drive controller (FDE)> port 0x3f2-0x3f5,0x3f7 irq 6 drq 2 on acpi0
fdc0: does not respond
device_attach: fdc0 attach returned 6
ACPI: Enabled 2 GPEs in block 00 to 0F
ahc_isa_identify 0: ioport 0xc00 alloc failed
ahc_isa_identify 1: ioport 0x1c00 alloc failed
ahc_isa_identify 2: ioport 0x2c00 alloc failed
ahc_isa_identify 3: ioport 0x3c00 alloc failed
ahc_isa_identify 4: ioport 0x4c00 alloc failed
ahc_isa_identify 5: ioport 0x5c00 alloc failed
ahc_isa_identify 6: ioport 0x6c00 alloc failed
ahc_isa_identify 7: ioport 0x7c00 alloc failed
ahc_isa_identify 8: ioport 0x8c00 alloc failed
ahc_isa_identify 9: ioport 0x9c00 alloc failed
ahc_isa_identify 10: ioport 0xac00 alloc failed
ahc_isa_identify 11: ioport 0xbc00 alloc failed
ahc_isa_identify 12: ioport 0xcc00 alloc failed
ahc_isa_identify 13: ioport 0xdc00 alloc failed
ahc_isa_identify 14: ioport 0xec00 alloc failed
pcib0: allocated type 3 (0xb0000-0xb07ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb0800-0xb0fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb1000-0xb17ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb1800-0xb1fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb2000-0xb27ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb2800-0xb2fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb3000-0xb37ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb3800-0xb3fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb4000-0xb47ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb4800-0xb4fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb5000-0xb57ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb5800-0xb5fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb6000-0xb67ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb6800-0xb6fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb7000-0xb77ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb7800-0xb7fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb8000-0xb87ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb8800-0xb8fff) for rid 0 of orm0
pcib0: allocated type 3 (0xb9000-0xb97ff) for rid 0 of orm0
pcib0: allocated type 3 (0xb9800-0xb9fff) for rid 0 of orm0
pcib0: allocated type 3 (0xba000-0xba7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xba800-0xbafff) for rid 0 of orm0
pcib0: allocated type 3 (0xbb000-0xbb7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xbb800-0xbbfff) for rid 0 of orm0
pcib0: allocated type 3 (0xbc000-0xbc7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xbc800-0xbcfff) for rid 0 of orm0
pcib0: allocated type 3 (0xbd000-0xbd7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xbd800-0xbdfff) for rid 0 of orm0
pcib0: allocated type 3 (0xbe000-0xbe7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xbe800-0xbefff) for rid 0 of orm0
pcib0: allocated type 3 (0xbf000-0xbf7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xbf800-0xbffff) for rid 0 of orm0
isa_probe_children: disabling PnP devices
atkbdc: atkbdc0 already exists; skipping it
atrtc: atrtc0 already exists; skipping it
sc: sc0 already exists; skipping it
uart: uart0 already exists; skipping it
isa_probe_children: probing non-PnP devices
orm0: <ISA Option ROM> at iomem 0xe8800-0xeffff pnpid ORM0000 on isa0
sc0 failed to probe on isa0
vga0: <Generic ISA VGA> at port 0x3b0-0x3bb iomem 0xb0000-0xb7fff pnpid PNP0900 on isa0
pcib0: allocated type 4 (0x3b0-0x3bb) for rid 0 of vga0
pcib0: allocated type 3 (0xb0000-0xb7fff) for rid 0 of vga0
attimer0: <AT timer> at port 0x40 on isa0
pcib0: allocated type 4 (0x40-0x43) for rid 0 of attimer0
Timecounter "i8254" frequency 1193182 Hz quality 0
ioapic0: routing intpin 2 (ISA IRQ 0) to lapic 1 vector 52
Event timer "i8254" frequency 1193182 Hz quality 100
fdc0: No FDOUT register!
fdc0 failed to probe at port 0x3f0 irq 6 drq 2 on isa0
ppc0: cannot reserve I/O port range
ppc0 failed to probe at irq 7 on isa0
pcib0: allocated type 4 (0x2f8-0x2f8) for rid 0 of uart1
uart1 failed to probe at port 0x2f8 irq 3 on isa0
isa_probe_children: probing PnP devices
Device configuration finished.
procfs registered
Statistical TSC calibration took 359 us and 3633 data points
Timecounter "TSC-low" frequency 1548000442 Hz quality -100
Statistical lapic calibration took 2053 us and 523 data points
lapic: Divisor 2, Frequency 500004157 Hz
Timecounters tick every 10.000 msec
ZFS filesystem version: 5
ZFS storage pool version: features support (5000)
vlan: initialized, using hash tables with chaining
enc0: bpf attached
lo0: bpf attached
IPsec: Initialized Security Association Processing.
tcp_init: net.inet.tcp.tcbhashsize auto tuned to 65536
ugen2.1: <Intel UHCI root HUB> at usbus2
ugen1.1: <Intel UHCI root HUB> at usbus1
uhub0 on usbus2
uhub0: <Intel UHCI root HUB, class 9/0, rev 1.00/1.00, addr 1> on usbus2
uhub1 on usbus1
uhub1: <Intel UHCI root HUB, class 9/0, rev 1.00/1.00, addr 1> on usbus1
ugen0.1: <Intel UHCI root HUB> at usbus0
ugen3.1: <Intel EHCI root HUB> at usbus3
uhub2 on usbus0
uhub2: <Intel UHCI root HUB, class 9/0, rev 1.00/1.00, addr 1> on usbus0
pflog0: bpf attached
pfsync0: bpf attached
ata0: reset tp1 mask=03 ostat0=00 ostat1=00
pci0: driver added
found->	vendor=0x8086, dev=0x7113, revid=0x03
	domain=0, bus=0, slot=1, func=3
	class=06-80-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0280, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=9
pci0:0:1:3: reprobing on driver added
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=7, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:7:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb60000-0xfeb6ffff,0xfeb70000-0xfeb7ffff,0xfeb80000-0xfeb8ffff irq 11 at device 7.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 0 vector 56
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
ata0: stat0=0x00 err=0x00 lsb=0x00 msb=0x00
ata0: stat1=0x00 err=0x00 lsb=0x00 msb=0x00
found->	vendor=0x14e4, dev=0x1657, revid=0x01
ata0: reset tp2 stat0=00 stat1=00 devices=0x0
ata1: reset tp1 mask=03 ostat0=00 ostat1=00
	domain=0, bus=0, slot=8, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:8:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb90000-0xfeb9ffff,0xfeba0000-0xfebaffff,0xfebb0000-0xfebbffff irq 11 at device 8.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 1 vector 53
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
ata1: stat0=0x00 err=0x00 lsb=0x00 msb=0x00
found->	vendor=0x14e4, dev=0x1657, revid=0x01
ata1: stat1=0x00 err=0x00 lsb=0x00 msb=0x00
	domain=0, bus=0, slot=9, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0102, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=10
ata1: reset tp2 stat0=00 stat1=00 devices=0x0
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:9:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfebc0000-0xfebcffff,0xfebd0000-0xfebdffff,0xfebe0000-0xfebeffff irq 10 at device 9.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 0 vector 56
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
pci0: driver added
found->	vendor=0x8086, dev=0x7113, revid=0x03
	domain=0, bus=0, slot=1, func=3
	class=06-80-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0103, statreg=0x0280, cachelnsz=0 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=9
pci0:0:1:3: reprobing on driver added
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=7, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0106, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:7:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb60000-0xfeb6ffff,0xfeb70000-0xfeb7ffff,0xfeb80000-0xfeb8ffff irq 11 at device 7.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 1 vector 53
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=8, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0106, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=a, irq=11
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:8:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfeb90000-0xfeb9ffff,0xfeba0000-0xfebaffff,0xfebb0000-0xfebbffff irq 11 at device 8.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 0 vector 56
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
found->	vendor=0x14e4, dev=0x1657, revid=0x01
	domain=0, bus=0, slot=9, func=0
	class=02-00-00, hdrtype=0x00, mfdev=0
	cmdreg=0x0106, statreg=0x0010, cachelnsz=16 (dwords)
	lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
	intpin=b, irq=10
	powerspec 3  supports D0 D3  current D0
	MSI supports 8 messages, 64 bit
	MSI-X supports 17 messages in map 0x20
pci0:0:9:0: reprobing on driver added
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xfebc0000-0xfebcffff,0xfebd0000-0xfebdffff,0xfebe0000-0xfebeffff irq 10 at device 9.0 on pci0
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 27 to local APIC 1 vector 53
bge1: using IRQ 27 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
bge1: Try again
bge1: Try again
bge1: Try again
bge1: Try again
bge1: attaching PHYs failed
device_attach: bge1 attach returned 6
Trying to mount root from ufs:/dev/ufsid/65cff5e3dcba5dfe [rw,noatime]...
uhub3 on usbus3
uhub3: <Intel EHCI root HUB, class 9/0, rev 2.00/1.00, addr 1> on usbus3
kvmclock0: providing initial system time
Dual Console: Serial Primary, Video Secondary
start_init: trying /sbin/init
uhub0: 2 ports with 2 removable, self powered
uhub2: 2 ports with 2 removable, self powered
uhub1: 2 ports with 2 removable, self powered
cpuctl: access to MSR registers/cpuid info.
CPU: Intel(R) Core(TM) i3-8100T CPU @ 3.10GHz (3096.00-MHz K8-class CPU)
  Origin="GenuineIntel"  Id=0x906eb  Family=0x6  Model=0x9e  Stepping=11
  Features=0xf8bfbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,CLFLUSH,MMX,FXSR,SSE,SSE2,SS>
  Features2=0xfffab223<SSE3,PCLMULQDQ,VMX,SSSE3,FMA,CX16,PDCM,PCID,SSE4.1,SSE4.2,x2APIC,MOVBE,POPCNT,TSCDLT,AESNI,XSAVE,OSXSAVE,AVX,F16C,RDRAND,HV>
  AMD Features=0x2c100800<SYSCALL,NX,Page1GB,RDTSCP,LM>
  AMD Features2=0x121<LAHF,ABM,Prefetch>
  Structured Extended Features=0x9c47ab<FSGSBASE,TSCADJ,BMI1,AVX2,SMEP,BMI2,ERMS,INVPCID,MPX,RDSEED,ADX,SMAP,CLFLUSHOPT>
  Structured Extended Features2=0x4<UMIP>
  Structured Extended Features3=0xac000400<MD_CLEAR,IBPB,STIBP,ARCH_CAP,SSBD>
  XSAVE Features=0xf<XSAVEOPT,XSAVEC,XINUSE,XSAVES>
  IA32_ARCH_CAPS=0x4c<RSBA,SKIP_L1DFL_VME>
  AMD Extended Feature Extensions ID EBX=0x100d000<IBPB,IBRS,STIBP,SSBD>
  VT-x: Basic Features=0xd81000<INS/OUTS,TRUE>
        Pin-Based Controls=0x7f<ExtINT,NMI,VNMI,PreTmr>
        Primary Processor Controls=0xfff9fffe<INTWIN,TSCOff,HLT,INVLPG,MWAIT,RDPMC,RDTSC,CR3-LD,CR3-ST,CR8-LD,CR8-ST,TPR,NMIWIN,MOV-DR,IO,IOmap,MTF,MSRmap,MONITOR,PAUSE>
        Secondary Processor Controls=0x1378ff<APIC,EPT,DT,RDTSCP,x2APIC,VPID,WBINVD,UG,RDRAND,INVPCID,VMFUNC,VMCS,XSAVES>
        Exit Controls=0xd81000<PERF,PAT-LD,EFER-SV,PTMR-SV>
        Entry Controls=0xd81000
        EPT Features=0x6334041<XO,PW4,WB,2M,1G,INVEPT,AD,single,all>
        VPID Features=0xf01<INVVPID,individual,single,all,single-globals>
3rd-level cache: 16MByte, 16-way set associative, 64 byte line size
2nd-level cache: 2-MB, 8-way set associative, 64-byte line size
1st-level instruction cache: 32 KB, 8-way set associative, 64 byte line size
1st-level data cache: 32 KB, 8-way set associative, 64 byte line size
L2 cache: 512 kbytes, 16-way associative, 64 bytes/line
Hypervisor: Origin = "KVMKVMKVM"
