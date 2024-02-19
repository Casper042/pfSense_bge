# boot -v of Bare Metal pfSense with HP 331T Broadcom bge showing all 4 ports.
# No System Tunables were added. Seems to work right out of the box.

Copyright (c) 1992-2023 The FreeBSD Project.
Copyright (c) 1979, 1980, 1983, 1986, 1988, 1989, 1991, 1992, 1993, 1994
        The Regents of the University of California. All rights reserved.
FreeBSD is a registered trademark of The FreeBSD Foundation.
FreeBSD 14.0-CURRENT amd64 1400094 #1 RELENG_2_7_2-n255948-8d2b56da39c: Wed Dec  6 20:45:47 UTC 2023
    root@freebsd:/var/jenkins/workspace/pfSense-CE-snapshots-2_7_2-main/obj/amd64/StdASW5b/var/jenkins/workspace/pfSense-CE-snapshots-2_7_2-main/sources/FreeBSD-src-RELENG_2_7_2/amd64.amd64/sys/pfSense amd64
FreeBSD clang version 16.0.6 (https://github.com/llvm/llvm-project.git llvmorg-16.0.6-0-g7cbf1a259152)
PPIM 0: PA=0xa0000000, VA=0xffffffff84410000, size=0x1d5000, mode=0x1
pmap: large map 8 PML4 slots (4096 GB)
VT(efifb): resolution 800x600
Preloaded elf kernel "/boot/kernel/kernel" at 0xffffffff83c06000.
Preloaded elf obj module "/boot/kernel/zfs.ko" at 0xffffffff83c0fc48.
Preloaded elf obj module "/boot/kernel/opensolaris.ko" at 0xffffffff83c104b0.
Preloaded boot_entropy_cache "/boot/entropy" at 0xffffffff83c10b20.
Preloaded boot_entropy_platform "efi_rng_seed" at 0xffffffff83c10b78.
Preloaded TSLOG data "TSLOG" at 0xffffffff83c10bd0.
CPU: Intel(R) Core(TM) i3-8100T CPU @ 3.10GHz (3100.00-MHz K8-class CPU)
  Origin="GenuineIntel"  Id=0x906eb  Family=0x6  Model=0x9e  Stepping=11
  Features=0xbfebfbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,CLFLUSH,DTS,ACPI,MMX,FXSR,SSE,SSE2,SS,HTT,TM,PBE>
  Features2=0x7ffafbbf<SSE3,PCLMULQDQ,DTES64,MON,DS_CPL,VMX,EST,TM2,SSSE3,SDBG,FMA,CX16,xTPR,PDCM,PCID,SSE4.1,SSE4.2,x2APIC,MOVBE,POPCNT,TSCDLT,AESNI,XSAVE,OSXSAVE,AVX,F16C,RDRAND>
  AMD Features=0x2c100800<SYSCALL,NX,Page1GB,RDTSCP,LM>
  AMD Features2=0x121<LAHF,ABM,Prefetch>
  Structured Extended Features=0x29c67af<FSGSBASE,TSCADJ,SGX,BMI1,AVX2,SMEP,BMI2,ERMS,INVPCID,NFPUSG,MPX,RDSEED,ADX,SMAP,CLFLUSHOPT,PROCTRACE>
  Structured Extended Features3=0xbc002e00<MCUOPT,MD_CLEAR,TSXFA,IBPB,STIBP,L1DFL,ARCH_CAP,SSBD>
  XSAVE Features=0xf<XSAVEOPT,XSAVEC,XINUSE,XSAVES>
  IA32_ARCH_CAPS=0x2000c04<RSBA>
  VT-x: Basic Features=0xda0400<SMM,INS/OUTS,TRUE>
        Pin-Based Controls=0x7f<ExtINT,NMI,VNMI,PreTmr>
        Primary Processor Controls=0xfff9fffe<INTWIN,TSCOff,HLT,INVLPG,MWAIT,RDPMC,RDTSC,CR3-LD,CR3-ST,CR8-LD,CR8-ST,TPR,NMIWIN,MOV-DR,IO,IOmap,MTF,MSRmap,MONITOR,PAUSE>
        Secondary Processor Controls=0x5fbcff<APIC,EPT,DT,RDTSCP,x2APIC,VPID,WBINVD,UG,PAUSE-loop,RDRAND,INVPCID,VMFUNC,EPT#VE,XSAVES>
        Exit Controls=0xda0400<PAT-LD,EFER-SV,PTMR-SV>
        Entry Controls=0xda0400
        EPT Features=0x6734141<XO,PW4,UC,WB,2M,1G,INVEPT,AD,single,all>
        VPID Features=0xf01<INVVPID,individual,single,all,single-globals>
  TSC: P-state invariant, performance statistics
Data TLB: 2 MByte or 4 MByte pages, 4-way set associative, 32 entries and a separate array with 1 GByte pages, 4-way set associative, 4 entries
Data TLB: 4 KB pages, 4-way set associative, 64 entries
Instruction TLB: 2M/4M pages, fully associative, 8 entries
Instruction TLB: 4KByte pages, 8-way set associative, 128 entries
64-Byte prefetching
Shared 2nd-Level TLB: 4 KByte /2 MByte pages, 6-way associative, 1536 entries. Also 1GBbyte pages, 4-way, 16 entries
L2 cache: 256 kbytes, 8-way associative, 64 bytes/line
real memory  = 34359738368 (32768 MB)
Physical memory chunk(s):
0x0000000000010000 - 0x000000000005efff, 323584 bytes (79 pages)
0x0000000000060000 - 0x000000000009ffff, 262144 bytes (64 pages)
0x0000000000100000 - 0x00000000871fffff, 2265972736 bytes (553216 pages)
0x000000008b001000 - 0x0000000098ff2fff, 234823680 bytes (57330 pages)
0x000000009bc0f000 - 0x000000009bc0ffff, 4096 bytes (1 pages)
0x0000000100001000 - 0x0000000827b61fff, 30731014144 bytes (7502689 pages)
0x000000085e600000 - 0x000000085e6e8fff, 954368 bytes (233 pages)
avail memory = 33177587712 (31640 MB)
intel stolen mem: base 0x9d800000 size 32 MB
MADT: Found CPU APIC ID 0 ACPI ID 1: enabled
SMP: Added CPU 0 (AP)
MADT: Found CPU APIC ID 2 ACPI ID 2: enabled
SMP: Added CPU 2 (AP)
MADT: Found CPU APIC ID 4 ACPI ID 3: enabled
SMP: Added CPU 4 (AP)
MADT: Found CPU APIC ID 6 ACPI ID 4: enabled
SMP: Added CPU 6 (AP)
Event timer "LAPIC" quality 600
ACPI APIC Table: <LENOVO TC-M1U  >
Package ID shift: 4
L3 cache ID shift: 4
L2 cache ID shift: 1
L1 cache ID shift: 1
Core ID shift: 1
AP boot address 0x5e000
INTR: Adding local APIC 2 as a target
INTR: Adding local APIC 4 as a target
INTR: Adding local APIC 6 as a target
FreeBSD/SMP: Multiprocessor System Detected: 4 CPUs
FreeBSD/SMP: 1 package(s) x 4 core(s)
Package HW ID = 0
        Core HW ID = 0
                CPU0 (BSP): APIC ID: 0
        Core HW ID = 1
                CPU1 (AP): APIC ID: 2
        Core HW ID = 2
                CPU2 (AP): APIC ID: 4
        Core HW ID = 3
                CPU3 (AP): APIC ID: 6
APIC: CPU 0 has ACPI ID 1
APIC: CPU 1 has ACPI ID 2
APIC: CPU 2 has ACPI ID 3
APIC: CPU 3 has ACPI ID 4
x86bios:  IVT 0x000000-0x0004ff at 0xfffff80000000000
x86bios: SSEG 0x05e000-0x05efff at 0xfffffe0039806000
x86bios: EBDA 0x09e000-0x09ffff at 0xfffff8000009e000
x86bios:  ROM 0x0a0000-0x0fefff at 0xfffff800000a0000
Pentium Pro MTRR support enabled
random: registering fast source Intel Secure Key RNG
random: fast provider: "Intel Secure Key RNG"
random: read 4096 bytes from preloaded cache
random: read 2048 bytes from platform bootloader
random: unblocking device.
VIMAGE (virtualized network stack) enabled
hostuuid: using 00000000-0000-0000-0000-000000000000
ULE: setup cpu 0
ULE: setup cpu 1
ULE: setup cpu 2
ULE: setup cpu 3
ACPI: RSDP 0x000000009AAFF000 000024 (v02 LENOVO)
ACPI: XSDT 0x000000009AAFF0C0 0000FC (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: FACP 0x000000009AB4B960 000114 (v06 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: DSDT 0x000000009AAFF248 04C718 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: FACS 0x000000009AFDC080 000040
ACPI: APIC 0x000000009AB4BA78 000084 (v04 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: FPDT 0x000000009AB4BB00 000044 (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: FIDT 0x000000009AB4BB48 00009C (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: MCFG 0x000000009AB4BBE8 00003C (v01 LENOVO TC-M1U   00001730 MSFT 00000097)
ACPI: SSDT 0x000000009AB4BC28 0003A3 (v01 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: SSDT 0x000000009AB4BFD0 001B5A (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: SLIC 0x000000009AB4DB30 000176 (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: SSDT 0x000000009AB4DCA8 0031C6 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: SSDT 0x000000009AB50E70 002351 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: HPET 0x000000009AB531C8 000038 (v01 LENOVO TC-M1U   00001730      01000013)
ACPI: SSDT 0x000000009AB53200 001C01 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: SSDT 0x000000009AB54E08 000FAE (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: UEFI 0x000000009AB55DB8 000042 (v01 LENOVO TC-M1U   00001730      01000013)
ACPI: LPIT 0x000000009AB55E00 00005C (v01 LENOVO TC-M1U   00001730      01000013)
ACPI: SSDT 0x000000009AB55E60 0027DE (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: SSDT 0x000000009AB58640 0014E2 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: DBGP 0x000000009AB59B28 000034 (v01 LENOVO TC-M1U   00001730      01000013)
ACPI: DBG2 0x000000009AB59B60 000054 (v00 LENOVO TC-M1U   00001730      01000013)
ACPI: SSDT 0x000000009AB59BB8 001B67 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: DMAR 0x000000009AB5B720 0000A8 (v01 LENOVO TC-M1U   00001730      01000013)
ACPI: SSDT 0x000000009AB5B7C8 000144 (v02 LENOVO TC-M1U   00001730 INTL 20160527)
ACPI: NHLT 0x000000009AB5B910 00002D (v00 LENOVO TC-M1U   00001730      01000013)
ACPI: BGRT 0x000000009AB5B940 000038 (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: TPM2 0x000000009AB5B978 000034 (v04 LENOVO TC-M1U   00001730 AMI  00000000)
ACPI: LUFT 0x000000009AB5B9B0 034CC2 (v01 LENOVO TC-M1U   00001730 AMI  00010013)
ACPI: WSMT 0x000000009AB90678 000028 (v01 LENOVO TC-M1U   00001730 AMI  00010013)
MADT: Found IO APIC ID 2, Interrupt 0 at 0xfec00000
ioapic0: ver 0x20 maxredir 0x77
ioapic0: Routing external 8259A's -> intpin 0
lapic0: Routing NMI -> LINT1
lapic0: LINT1 trigger: edge
lapic0: LINT1 polarity: high
lapic2: Routing NMI -> LINT1
lapic2: LINT1 trigger: edge
lapic2: LINT1 polarity: high
lapic4: Routing NMI -> LINT1
lapic4: LINT1 trigger: edge
lapic4: LINT1 polarity: high
lapic6: Routing NMI -> LINT1
lapic6: LINT1 trigger: edge
lapic6: LINT1 polarity: high
MADT: Interrupt override: source 0, irq 2
ioapic0: Routing IRQ 0 -> intpin 2
MADT: Interrupt override: source 9, irq 9
ioapic0: intpin 9 trigger: level
ioapic0 <Version 2.0> irqs 0-119
cpu0 BSP:
     ID: 0x00000000   VER: 0x01060015 LDR: 0x00000001 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000011ff
  timer: 0x000300ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
   cmci: 0x000000f2
SMP: AP CPU #2 Launched!
cpu2 AP:
     ID: 0x00000004   VER: 0x01060015 LDR: 0x00000010 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000011ff
  timer: 0x000100ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
   cmci: 0x000000f2
SMP: AP CPU #1 Launched!
cpu1 AP:
     ID: 0x00000002   VER: 0x01060015 LDR: 0x00000004 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000011ff
  timer: 0x000100ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
   cmci: 0x000000f2
SMP: AP CPU #3 Launched!
cpu3 AP:
     ID: 0x00000006   VER: 0x01060015 LDR: 0x00000040 DFR: 0x00000000 x2APIC: 1
  lint0: 0x00010700 lint1: 0x00000400 TPR: 0x00000000 SVR: 0x000011ff
  timer: 0x000100ef therm: 0x00010000 err: 0x000000f0 pmc: 0x00010400
   cmci: 0x000000f2
SMP: passed TSC synchronization test
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
[ath_hal] loaded
kbd: new array size 4
kbd1 at kbdmux0
mem: <memory>
crypto: <crypto core>
null: <full device, null device, zero device>
io: <I/O>
tcp_log: tcp_log device
WARNING: Device "spkr" is Giant locked and may be deleted before FreeBSD 14.0.
netgate0: <unknown hardware>
efirtc0: <EFI Realtime Clock>
efirtc0: registered as a time-of-day clock, resolution 1.000000s
smbios0: <System Management BIOS> at iomem 0x9b8b4000-0x9b8b401e
smbios0: Version: 3.2, BCD Revision: 2.8
crypto: assign cryptosoft0 driver id 0, flags 0x6000000
acpi0: <LENOVO TC-M1U>
ACPI: 11 ACPI AML tables successfully acquired and loaded
PCIe: Memory Mapped configuration base @ 0xf0000000
ioapic0: routing intpin 9 (ISA IRQ 9) to lapic 0 vector 48
acpi0: Power Button (fixed)
acpi0: wakeup code va 0xfffffe00397eb000 pa 0x5c000
cpu0: <ACPI CPU> on acpi0
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF80002074400 000400 (v02 PmRef  Cpu0Cst  00003001 INTL 20160527)
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF80001FFF800 000626 (v02 PmRef  Cpu0Ist  00003000 INTL 20160527)
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF800021F5B00 0000F4 (v02 PmRef  Cpu0Psd  00003000 INTL 20160527)
cpu1: <ACPI CPU> on acpi0
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF80002000800 0005FC (v02 PmRef  ApIst    00003000 INTL 20160527)
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF800021F1000 000AB0 (v02 PmRef  ApPsd    00003000 INTL 20160527)
ACPI: Dynamic OEM Table Load:
ACPI: SSDT 0xFFFFF800011AF400 00030A (v02 PmRef  ApCst    00003000 INTL 20160527)
cpu2: <ACPI CPU> on acpi0
cpu3: <ACPI CPU> on acpi0
ACPI: Processor \134_SB_.PR04 (ACPI ID 5) ignored
ACPI: Processor \134_SB_.PR05 (ACPI ID 6) ignored
ACPI: Processor \134_SB_.PR06 (ACPI ID 7) ignored
ACPI: Processor \134_SB_.PR07 (ACPI ID 8) ignored
ACPI: Processor \134_SB_.PR08 (ACPI ID 9) ignored
ACPI: Processor \134_SB_.PR09 (ACPI ID 10) ignored
ACPI: Processor \134_SB_.PR10 (ACPI ID 11) ignored
ACPI: Processor \134_SB_.PR11 (ACPI ID 12) ignored
ACPI: Processor \134_SB_.PR12 (ACPI ID 13) ignored
ACPI: Processor \134_SB_.PR13 (ACPI ID 14) ignored
ACPI: Processor \134_SB_.PR14 (ACPI ID 15) ignored
ACPI: Processor \134_SB_.PR15 (ACPI ID 16) ignored
hpet0: <High Precision Event Timer> iomem 0xfed00000-0xfed003ff on acpi0
hpet0: vendor 0x8086, rev 0x1, 24000000Hz 64bit, 8 timers, legacy route
hpet0:  t0: irqs 0x00f00000 (0), MSI, 64bit, periodic
hpet0:  t1: irqs 0x00f00000 (0), MSI
hpet0:  t2: irqs 0x00f00800 (0), MSI
hpet0:  t3: irqs 0x00f01000 (0), MSI
hpet0:  t4: irqs 0x00000000 (0), MSI
hpet0:  t5: irqs 0x00000000 (0), MSI
hpet0:  t6: irqs 0x00000000 (0), MSI
hpet0:  t7: irqs 0x00000000 (0), MSI
Timecounter "HPET" frequency 24000000 Hz quality 950
msi: routing MSI-X IRQ 120 to local APIC 2 vector 48
msi: routing MSI-X IRQ 121 to local APIC 4 vector 48
msi: routing MSI-X IRQ 122 to local APIC 6 vector 48
msi: routing MSI-X IRQ 123 to local APIC 0 vector 49
msi: routing MSI-X IRQ 124 to local APIC 2 vector 49
msi: routing MSI-X IRQ 125 to local APIC 4 vector 49
msi: routing MSI-X IRQ 126 to local APIC 6 vector 49
msi: routing MSI-X IRQ 127 to local APIC 0 vector 50
msi: Assigning MSI-X IRQ 120 to local APIC 0 vector 51
msi: Assigning MSI-X IRQ 121 to local APIC 2 vector 48
msi: Assigning MSI-X IRQ 122 to local APIC 4 vector 48
msi: Assigning MSI-X IRQ 123 to local APIC 6 vector 48
msi: Assigning MSI-X IRQ 124 to local APIC 0 vector 49
msi: Assigning MSI-X IRQ 125 to local APIC 0 vector 52
msi: Assigning MSI-X IRQ 126 to local APIC 0 vector 53
Event timer "HPET" frequency 24000000 Hz quality 550
Event timer "HPET1" frequency 24000000 Hz quality 440
Event timer "HPET2" frequency 24000000 Hz quality 440
Event timer "HPET3" frequency 24000000 Hz quality 440
Event timer "HPET4" frequency 24000000 Hz quality 440
atrtc1: <AT realtime clock> on acpi0
atrtc1: Warning: Couldn't map I/O.
atrtc1: registered as a time-of-day clock, resolution 1.000000s
ioapic0: routing intpin 8 (ISA IRQ 8) to lapic 2 vector 49
ioapic0: routing intpin 8 (ISA IRQ 8) to lapic 0 vector 54
Event timer "RTC" frequency 32768 Hz quality 0
attimer0: <AT timer> port 0x40-0x43,0x50-0x53 irq 0 on acpi0
Timecounter "i8254" frequency 1193182 Hz quality 0
ioapic0: routing intpin 2 (ISA IRQ 0) to lapic 4 vector 49
Event timer "i8254" frequency 1193182 Hz quality 100
ACPI timer: -> 10
Timecounter "ACPI-fast" frequency 3579545 Hz quality 900
acpi_timer0: <24-bit timer at 3.579545MHz> port 0x1808-0x180b on acpi0
pci_link0:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link1:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link2:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link3:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link4:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link5:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link6:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pci_link7:        Index  IRQ  Rtd  Ref  IRQs
  Initial Probe       0  255   N     0  3 4 5 6 10 11 12 14 15
  Validation          0  255   N     0  3 4 5 6 10 11 12 14 15
  After Disable       0  255   N     0  3 4 5 6 10 11 12 14 15
pcib0: <ACPI Host-PCI bridge> port 0xcf8-0xcff on acpi0
pcib0: decoding 5 range 0-0x7e
pcib0: decoding 4 range 0-0xcf7
pcib0: decoding 4 range 0xd00-0xffff
pcib0: decoding 3 range 0xa0000-0xbffff
pcib0: decoding 3 range 0x9f800000-0xefffffff
pcib0: decoding 3 range 0xfc800000-0xfe7fffff
pci0: <ACPI PCI bus> on pcib0
pci0: domain=0, physical bus=0
found-> vendor=0x8086, dev=0x3e1f, revid=0x08
        domain=0, bus=0, slot=0, func=0
        class=06-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0006, statreg=0x2090, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
found-> vendor=0x8086, dev=0x1901, revid=0x08
        domain=0, bus=0, slot=1, func=0
        class=06-04-00, hdrtype=0x01, mfdev=1
        cmdreg=0x0007, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message
pcib0: matched entry for 0.1.INTA
pcib0: slot 1 INTA hardwired to IRQ 16
        secbus=1, subbus=1
found-> vendor=0x8086, dev=0x3e91, revid=0x00
        domain=0, bus=0, slot=2, func=0
        class=03-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0007, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 2  supports D0 D3  current D0
        MSI supports 1 message
        map[10]: type Memory, range 64, base 0xb1000000, size 24, enabled
pcib0: allocated type 3 (0xb1000000-0xb1ffffff) for rid 10 of pci0:0:2:0
        map[18]: type Prefetchable Memory, range 64, base 0xa0000000, size 28, enabled
pcib0: allocated type 3 (0xa0000000-0xafffffff) for rid 18 of pci0:0:2:0
        map[20]: type I/O Port, range 32, base 0x3000, size  6, enabled
pcib0: allocated type 4 (0x3000-0x303f) for rid 20 of pci0:0:2:0
pcib0: matched entry for 0.2.INTA
pcib0: slot 2 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0x1911, revid=0x00
        domain=0, bus=0, slot=8, func=0
        class=08-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0000, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 2  supports D0 D3  current D0
        MSI supports 1 message
        map[10]: type Memory, range 64, base 0xb233d000, size 12, memory disabled
pcib0: allocated type 3 (0xb233d000-0xb233dfff) for rid 10 of pci0:0:8:0
pcib0: matched entry for 0.8.INTA
pcib0: slot 8 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa36d, revid=0x10
        domain=0, bus=0, slot=20, func=0
        class=0c-03-30, hdrtype=0x00, mfdev=1
        cmdreg=0x0006, statreg=0x0290, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 2  supports D0 D3  current D0
        MSI supports 8 messages, 64 bit
        map[10]: type Memory, range 64, base 0xb2320000, size 16, enabled
pcib0: allocated type 3 (0xb2320000-0xb232ffff) for rid 10 of pci0:0:20:0
pcib0: matched entry for 0.20.INTA
pcib0: slot 20 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa36f, revid=0x10
        domain=0, bus=0, slot=20, func=2
        class=05-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0000, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        powerspec 3  supports D0 D3  current D0
        map[10]: type Memory, range 64, base 0xb2336000, size 13, memory disabled
pcib0: allocated type 3 (0xb2336000-0xb2337fff) for rid 10 of pci0:0:20:2
        map[18]: type Memory, range 64, base 0xb233c000, size 12, enabled
pcib0: allocated type 3 (0xb233c000-0xb233cfff) for rid 18 of pci0:0:20:2
found-> vendor=0x8086, dev=0xa360, revid=0x10
        domain=0, bus=0, slot=22, func=0
        class=07-80-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0000, statreg=0x0010, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message, 64 bit
        map[10]: type Memory, range 64, base 0xb233b000, size 12, memory disabled
pcib0: allocated type 3 (0xb233b000-0xb233bfff) for rid 10 of pci0:0:22:0
pcib0: matched entry for 0.22.INTA
pcib0: slot 22 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa352, revid=0x10
        domain=0, bus=0, slot=23, func=0
        class=01-06-01, hdrtype=0x00, mfdev=0
        cmdreg=0x0007, statreg=0x02b0, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message
        map[10]: type Memory, range 32, base 0xb2334000, size 13, enabled
pcib0: allocated type 3 (0xb2334000-0xb2335fff) for rid 10 of pci0:0:23:0
        map[14]: type Memory, range 32, base 0xb233a000, size  8, enabled
pcib0: allocated type 3 (0xb233a000-0xb233a0ff) for rid 14 of pci0:0:23:0
        map[18]: type I/O Port, range 32, base 0x3090, size  3, enabled
pcib0: allocated type 4 (0x3090-0x3097) for rid 18 of pci0:0:23:0
        map[1c]: type I/O Port, range 32, base 0x3080, size  2, enabled
pcib0: allocated type 4 (0x3080-0x3083) for rid 1c of pci0:0:23:0
        map[20]: type I/O Port, range 32, base 0x3060, size  5, enabled
pcib0: allocated type 4 (0x3060-0x307f) for rid 20 of pci0:0:23:0
        map[24]: type Memory, range 32, base 0xb2339000, size 11, enabled
pcib0: allocated type 3 (0xb2339000-0xb23397ff) for rid 24 of pci0:0:23:0
pcib0: matched entry for 0.23.INTA
pcib0: slot 23 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa32c, revid=0xf0
        domain=0, bus=0, slot=27, func=0
        class=06-04-00, hdrtype=0x01, mfdev=1
        cmdreg=0x0007, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message
pcib0: matched entry for 0.27.INTA
pcib0: slot 27 INTA hardwired to IRQ 16
        secbus=2, subbus=2
found-> vendor=0x8086, dev=0xa308, revid=0x10
        domain=0, bus=0, slot=31, func=0
        class=06-01-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0407, statreg=0x0000, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
found-> vendor=0x8086, dev=0xa348, revid=0x10
        domain=0, bus=0, slot=31, func=3
        class=04-03-80, hdrtype=0x00, mfdev=0
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x20 (960 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message, 64 bit
        map[10]: type Memory, range 64, base 0xb2330000, size 14, enabled
pcib0: allocated type 3 (0xb2330000-0xb2333fff) for rid 10 of pci0:0:31:3
        map[20]: type Memory, range 64, base 0xb2000000, size 20, enabled
pcib0: allocated type 3 (0xb2000000-0xb20fffff) for rid 20 of pci0:0:31:3
pcib0: matched entry for 0.31.INTA
pcib0: slot 31 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa323, revid=0x10
        domain=0, bus=0, slot=31, func=4
        class=0c-05-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0003, statreg=0x0280, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        map[10]: type Memory, range 64, base 0xb2338000, size  8, enabled
pcib0: allocated type 3 (0xb2338000-0xb23380ff) for rid 10 of pci0:0:31:4
        map[20]: type I/O Port, range 32, base 0xefa0, size  5, enabled
pcib0: allocated type 4 (0xefa0-0xefbf) for rid 20 of pci0:0:31:4
pcib0: matched entry for 0.31.INTA
pcib0: slot 31 INTA hardwired to IRQ 16
found-> vendor=0x8086, dev=0xa324, revid=0x10
        domain=0, bus=0, slot=31, func=5
        class=0c-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0402, statreg=0x0000, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        map[10]: type Memory, range 32, base 0xfe010000, size 12, enabled
pcib0: allocated type 3 (0xfe010000-0xfe010fff) for rid 10 of pci0:0:31:5
found-> vendor=0x8086, dev=0x15bc, revid=0x10
        domain=0, bus=0, slot=31, func=6
        class=02-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0006, statreg=0x0010, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=b, irq=10
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message, 64 bit
        map[10]: type Memory, range 32, base 0xb2300000, size 17, enabled
pcib0: allocated type 3 (0xb2300000-0xb231ffff) for rid 10 of pci0:0:31:6
pcib0: matched entry for 0.31.INTB
pcib0: slot 31 INTB hardwired to IRQ 17
pcib1: <ACPI PCI-PCI bridge> irq 16 at device 1.0 on pci0
pcib0: allocated type 3 (0xb2200000-0xb22fffff) for rid 20 of pcib1
pcib0: allocated type 3 (0xb0000000-0xb00fffff) for rid 24 of pcib1
pcib1:   domain            0
pcib1:   secondary bus     1
pcib1:   subordinate bus   1
pcib1:   memory decode     0xb2200000-0xb22fffff
pcib1:   prefetched decode 0xb0000000-0xb00fffff
pci1: <ACPI PCI bus> on pcib1
pcib1: allocated bus range (1-1) for rid 0 of pci1
pci1: domain=0, physical bus=1
found-> vendor=0x14e4, dev=0x1657, revid=0x01
        domain=0, bus=1, slot=0, func=0
        class=02-00-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 8 messages, 64 bit
        MSI-X supports 17 messages in map 0x20
        map[10]: type Prefetchable Memory, range 64, base 0xb00b0000, size 16, enabled
pcib1: allocated prefetch range (0xb00b0000-0xb00bffff) for rid 10 of pci0:1:0:0
        map[18]: type Prefetchable Memory, range 64, base 0xb00a0000, size 16, enabled
pcib1: allocated prefetch range (0xb00a0000-0xb00affff) for rid 18 of pci0:1:0:0
        map[20]: type Prefetchable Memory, range 64, base 0xb0090000, size 16, enabled
pcib1: allocated prefetch range (0xb0090000-0xb009ffff) for rid 20 of pci0:1:0:0
pcib1: matched entry for 1.0.INTA
pcib1: slot 0 INTA hardwired to IRQ 16
found-> vendor=0x14e4, dev=0x1657, revid=0x01
        domain=0, bus=1, slot=0, func=1
        class=02-00-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=b, irq=10
        powerspec 3  supports D0 D3  current D0
        MSI supports 8 messages, 64 bit
        MSI-X supports 17 messages in map 0x20
        map[10]: type Prefetchable Memory, range 64, base 0xb0080000, size 16, enabled
pcib1: allocated prefetch range (0xb0080000-0xb008ffff) for rid 10 of pci0:1:0:1
        map[18]: type Prefetchable Memory, range 64, base 0xb0070000, size 16, enabled
pcib1: allocated prefetch range (0xb0070000-0xb007ffff) for rid 18 of pci0:1:0:1
        map[20]: type Prefetchable Memory, range 64, base 0xb0060000, size 16, enabled
pcib1: allocated prefetch range (0xb0060000-0xb006ffff) for rid 20 of pci0:1:0:1
pcib1: matched entry for 1.0.INTB
pcib1: slot 0 INTB hardwired to IRQ 17
found-> vendor=0x14e4, dev=0x1657, revid=0x01
        domain=0, bus=1, slot=0, func=2
        class=02-00-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 8 messages, 64 bit
        MSI-X supports 17 messages in map 0x20
        map[10]: type Prefetchable Memory, range 64, base 0xb0050000, size 16, enabled
pcib1: allocated prefetch range (0xb0050000-0xb005ffff) for rid 10 of pci0:1:0:2
        map[18]: type Prefetchable Memory, range 64, base 0xb0040000, size 16, enabled
pcib1: allocated prefetch range (0xb0040000-0xb004ffff) for rid 18 of pci0:1:0:2
        map[20]: type Prefetchable Memory, range 64, base 0xb0030000, size 16, enabled
pcib1: allocated prefetch range (0xb0030000-0xb003ffff) for rid 20 of pci0:1:0:2
pcib1: matched entry for 1.0.INTA
pcib1: slot 0 INTA hardwired to IRQ 16
found-> vendor=0x14e4, dev=0x1657, revid=0x01
        domain=0, bus=1, slot=0, func=3
        class=02-00-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=b, irq=10
        powerspec 3  supports D0 D3  current D0
        MSI supports 8 messages, 64 bit
        MSI-X supports 17 messages in map 0x20
        map[10]: type Prefetchable Memory, range 64, base 0xb0020000, size 16, enabled
pcib1: allocated prefetch range (0xb0020000-0xb002ffff) for rid 10 of pci0:1:0:3
        map[18]: type Prefetchable Memory, range 64, base 0xb0010000, size 16, enabled
pcib1: allocated prefetch range (0xb0010000-0xb001ffff) for rid 18 of pci0:1:0:3
        map[20]: type Prefetchable Memory, range 64, base 0xb0000000, size 16, enabled
pcib1: allocated prefetch range (0xb0000000-0xb000ffff) for rid 20 of pci0:1:0:3
pcib1: matched entry for 1.0.INTB
pcib1: slot 0 INTB hardwired to IRQ 17
bge0: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xb00b0000-0xb00bffff,0xb00a0000-0xb00affff,0xb0090000-0xb009ffff irq 16 at device 0.0 on pci1
bge0: APE FW version: NCSI v1.4.22.0
bge0: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 128 to local APIC 6 vector 49
bge0: using IRQ 128 for MSI
bge0: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge0: Disabling fastboot
miibus0: <MII bus> on bge0
brgphy0: <BCM5719C 1000BASE-T media interface> PHY 1 on miibus0
brgphy0: OUI 0x001be9, model 0x0022, rev. 0
brgphy0:  10baseT, 10baseT-FDX, 100baseTX, 100baseTX-FDX, 1000baseT, 1000baseT-master, 1000baseT-FDX, 1000baseT-FDX-master, auto, auto-flow
bge0: Using defaults for TSO: 65518/35/2048
bge0: bpf attached
bge0: Ethernet address: 98:f2:b3:03:f1:74
bge1: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xb0080000-0xb008ffff,0xb0070000-0xb007ffff,0xb0060000-0xb006ffff irq 17 at device 0.1 on pci1
bge1: APE FW version: NCSI v1.4.22.0
bge1: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 129 to local APIC 0 vector 55
bge1: using IRQ 129 for MSI
bge1: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge1: Disabling fastboot
miibus1: <MII bus> on bge1
brgphy1: <BCM5719C 1000BASE-T media interface> PHY 2 on miibus1
brgphy1: OUI 0x001be9, model 0x0022, rev. 0
brgphy1:  10baseT, 10baseT-FDX, 100baseTX, 100baseTX-FDX, 1000baseT, 1000baseT-master, 1000baseT-FDX, 1000baseT-FDX-master, auto, auto-flow
bge1: Using defaults for TSO: 65518/35/2048
bge1: bpf attached
bge1: Ethernet address: 98:f2:b3:03:f1:75
bge2: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xb0050000-0xb005ffff,0xb0040000-0xb004ffff,0xb0030000-0xb003ffff irq 16 at device 0.2 on pci1
bge2: APE FW version: NCSI v1.4.22.0
bge2: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 130 to local APIC 2 vector 49
bge2: using IRQ 130 for MSI
bge2: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge2: Disabling fastboot
miibus2: <MII bus> on bge2
brgphy2: <BCM5719C 1000BASE-T media interface> PHY 3 on miibus2
brgphy2: OUI 0x001be9, model 0x0022, rev. 0
brgphy2:  10baseT, 10baseT-FDX, 100baseTX, 100baseTX-FDX, 1000baseT, 1000baseT-master, 1000baseT-FDX, 1000baseT-FDX-master, auto, auto-flow
bge2: Using defaults for TSO: 65518/35/2048
bge2: bpf attached
bge2: Ethernet address: 98:f2:b3:03:f1:76
bge3: <HP Ethernet 1Gb 4-port 331T Adapter, ASIC rev. 0x5719001> mem 0xb0020000-0xb002ffff,0xb0010000-0xb001ffff,0xb0000000-0xb000ffff irq 17 at device 0.3 on pci1
bge3: APE FW version: NCSI v1.4.22.0
bge3: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 131 to local APIC 4 vector 50
bge3: using IRQ 131 for MSI
bge3: CHIP ID 0x05719001; ASIC REV 0x5719; CHIP REV 0x57190; PCI-E
bge3: Disabling fastboot
miibus3: <MII bus> on bge3
brgphy3: <BCM5719C 1000BASE-T media interface> PHY 4 on miibus3
brgphy3: OUI 0x001be9, model 0x0022, rev. 0
brgphy3:  10baseT, 10baseT-FDX, 100baseTX, 100baseTX-FDX, 1000baseT, 1000baseT-master, 1000baseT-FDX, 1000baseT-FDX-master, auto, auto-flow
bge3: Using defaults for TSO: 65518/35/2048
bge3: bpf attached
bge3: Ethernet address: 98:f2:b3:03:f1:77
vgapci0: <VGA-compatible display> port 0x3000-0x303f mem 0xb1000000-0xb1ffffff,0xa0000000-0xafffffff irq 16 at device 2.0 on pci0
vgapci0: Boot video device
pci0: <base peripheral> at device 8.0 (no driver attached)
xhci0: <Intel Cannon Lake USB 3.1 controller> mem 0xb2320000-0xb232ffff irq 16 at device 20.0 on pci0
xhci0: 32 bytes context size, 64-bit DMA
xhci0: attempting to allocate 1 MSI vectors (8 supported)
msi: routing MSI IRQ 132 to local APIC 6 vector 50
xhci0: using IRQ 132 for MSI
xhci0: MSI enabled
usbus0 on xhci0
xhci0: usbpf: Attached
usbus0: 5.0Gbps Super Speed USB v3.0
pci0: <memory, RAM> at device 20.2 (no driver attached)
pci0: <simple comms> at device 22.0 (no driver attached)
ahci0: <Intel Cannon Lake AHCI SATA controller> port 0x3090-0x3097,0x3080-0x3083,0x3060-0x307f mem 0xb2334000-0xb2335fff,0xb233a000-0xb233a0ff,0xb2339000-0xb23397ff irq 16 at device 23.0 on pci0
ahci0: attempting to allocate 1 MSI vectors (1 supported)
msi: routing MSI IRQ 133 to local APIC 0 vector 56
ahci0: using IRQ 133 for MSI
ahci0: AHCI v1.31 with 6 6Gbps ports, Port Multiplier not supported
ahci0: Caps: 64bit NCQ SNTF ALP CLO 6Gbps PMD SSC PSC 32cmd EM 6ports
ahci0: Caps2: DESO SADM SDS APST
ahcich0: <AHCI channel> at channel 0 on ahci0
ahcich0: Caps:
ahcich1: <AHCI channel> at channel 1 on ahci0
ahcich1: Caps:
ahcich2: <AHCI channel> at channel 2 on ahci0
ahcich2: Caps:
ahcich3: <AHCI channel> at channel 3 on ahci0
ahcich3: Caps:
ahcich4: <AHCI channel> at channel 4 on ahci0
ahcich4: Caps:
ahcich5: <AHCI channel> at channel 5 on ahci0
ahcich5: Caps:
ahciem0: <AHCI enclosure management bridge> on ahci0
ahciem0: EM timeout
device_attach: ahciem0 attach returned 6
pcib2: <ACPI PCI-PCI bridge> irq 16 at device 27.0 on pci0
pcib0: allocated type 3 (0xb2100000-0xb21fffff) for rid 20 of pcib2
pcib2:   domain            0
pcib2:   secondary bus     2
pcib2:   subordinate bus   2
pcib2:   memory decode     0xb2100000-0xb21fffff
pci2: <ACPI PCI bus> on pcib2
pcib2: allocated bus range (2-2) for rid 0 of pci2
pci2: domain=0, physical bus=2
found-> vendor=0x144d, dev=0xa804, revid=0x00
        domain=0, bus=2, slot=0, func=0
        class=01-08-02, hdrtype=0x00, mfdev=0
        cmdreg=0x0006, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=11
        powerspec 3  supports D0 D3  current D0
        MSI supports 32 messages, 64 bit
        MSI-X supports 8 messages in map 0x10
        map[10]: type Memory, range 64, base 0xb2100000, size 14, enabled
pcib2: allocated memory range (0xb2100000-0xb2103fff) for rid 10 of pci0:2:0:0
pcib2: matched entry for 2.0.INTA
pcib2: slot 0 INTA hardwired to IRQ 16
nvme0: <Generic NVMe Device> mem 0xb2100000-0xb2103fff irq 16 at device 0.0 on pci2
nvme0: attempting to allocate 5 MSI-X vectors (8 supported)
msi: routing MSI-X IRQ 134 to local APIC 2 vector 50
msi: routing MSI-X IRQ 135 to local APIC 4 vector 51
msi: routing MSI-X IRQ 136 to local APIC 6 vector 51
msi: routing MSI-X IRQ 137 to local APIC 0 vector 57
msi: routing MSI-X IRQ 138 to local APIC 2 vector 51
nvme0: using IRQs 134-138 for MSI-X
nvme0: CapLo: 0x3c033fff: MQES 16383, CQR, AMS WRRwUPC, TO 60
nvme0: CapHi: 0x00f00020: DSTRD 0, CSS 1, MPSMIN 0, MPSMAX 15
nvme0: Version: 0x00010200: 1.2
isab0: <PCI-ISA bridge> at device 31.0 on pci0
isa0: <ISA bus> on isab0
hdac0: <Intel Coffee Lake HDA Controller> mem 0xb2330000-0xb2333fff,0xb2000000-0xb20fffff irq 16 at device 31.3 on pci0
hdac0: PCI card vendor: 0x17aa, device: 0x312d
hdac0: HDA Driver Revision: 20120126_0002
hdac0: Config options: on=0x00000000 off=0x00000000
hdac0: attempting to allocate 1 MSI vectors (1 supported)
msi: routing MSI IRQ 139 to local APIC 4 vector 52
hdac0: using IRQ 139 for MSI
hdac0: Caps: OSS 9, ISS 7, BSS 0, NSDO 1, 64bit, CORB 256, RIRB 256
pci0: <serial bus, SMBus> at device 31.4 (no driver attached)
pci0: <serial bus> at device 31.5 (no driver attached)
em0: <Intel(R) I219-V CNP(7)> mem 0xb2300000-0xb231ffff irq 17 at device 31.6 on pci0
em0: attach_pre capping queues at 1
em0: EEPROM V0.5-4
em0: Using 1024 TX descriptors and 1024 RX descriptors
em0: msix_init qsets capped at 1
em0: attempting to allocate 1 MSI vectors (1 supported)
msi: routing MSI IRQ 140 to local APIC 6 vector 52
em0: using IRQ 140 for MSI
em0: Using an MSI interrupt
em0: allocated for 1 tx_queues
em0: allocated for 1 rx_queues
msi: Assigning MSI IRQ 140 to local APIC 4 vector 53
em0: bpf attached
em0: Ethernet address: 54:05:db:50:69:8a
em0: netmap queues/slots: TX 1/1024, RX 1/1024
acpi_button0: <Sleep Button> on acpi0
acpi_button1: <Power Button> on acpi0
acpi_tz0: <Thermal Zone> on acpi0
acpi_syscontainer0: <System Container> on acpi0
ACPI: Enabled 6 GPEs in block 00 to 7F
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
pcib0: allocated type 3 (0xa0000-0xa07ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa0800-0xa0fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa1000-0xa17ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa1800-0xa1fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa2000-0xa27ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa2800-0xa2fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa3000-0xa37ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa3800-0xa3fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa4000-0xa47ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa4800-0xa4fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa5000-0xa57ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa5800-0xa5fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa6000-0xa67ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa6800-0xa6fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa7000-0xa77ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa7800-0xa7fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa8000-0xa87ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa8800-0xa8fff) for rid 0 of orm0
pcib0: allocated type 3 (0xa9000-0xa97ff) for rid 0 of orm0
pcib0: allocated type 3 (0xa9800-0xa9fff) for rid 0 of orm0
pcib0: allocated type 3 (0xaa000-0xaa7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xaa800-0xaafff) for rid 0 of orm0
pcib0: allocated type 3 (0xab000-0xab7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xab800-0xabfff) for rid 0 of orm0
pcib0: allocated type 3 (0xac000-0xac7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xac800-0xacfff) for rid 0 of orm0
pcib0: allocated type 3 (0xad000-0xad7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xad800-0xadfff) for rid 0 of orm0
pcib0: allocated type 3 (0xae000-0xae7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xae800-0xaefff) for rid 0 of orm0
pcib0: allocated type 3 (0xaf000-0xaf7ff) for rid 0 of orm0
pcib0: allocated type 3 (0xaf800-0xaffff) for rid 0 of orm0
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
attimer: attimer0 already exists; skipping it
sc: sc0 already exists; skipping it
isa_probe_children: probing non-PnP devices
orm0: <ISA Option ROM> at iomem 0xd0000-0xd0fff pnpid ORM0000 on isa0
sc0 failed to probe on isa0
vga0 failed to probe on isa0
pcib0: allocated type 4 (0x60-0x60) for rid 0 of atkbdc0
pcib0: allocated type 4 (0x64-0x64) for rid 1 of atkbdc0
atkbdc0: <Keyboard controller (i8042)> at port 0x60,0x64 on isa0
pcib0: allocated type 4 (0x60-0x60) for rid 0 of atkbdc0
pcib0: allocated type 4 (0x64-0x64) for rid 1 of atkbdc0
atkbd0: <AT Keyboard> irq 1 on atkbdc0
kbd0 at atkbd0
kbd0: atkbd0, generic (0), config:0x0, flags:0x1f0000
ioapic0: routing intpin 1 (ISA IRQ 1) to lapic 0 vector 58
atkbd0: [GIANT-LOCKED]
psm0: unable to allocate IRQ
atrtc0: <AT realtime clock> at port 0x70 irq 8 on isa0
atrtc0: Warning: Couldn't map I/O.
atrtc0: registered as a time-of-day clock, resolution 1.000000s
atrtc0: Can't map interrupt.
pcib0: allocated type 4 (0x3f0-0x3f5) for rid 0 of fdc0
pcib0: allocated type 4 (0x3f7-0x3f7) for rid 1 of fdc0
fdc0 failed to probe at port 0x3f0-0x3f5,0x3f7 irq 6 drq 2 on isa0
ppc0: cannot reserve I/O port range
ppc0 failed to probe at irq 7 on isa0
pcib0: allocated type 4 (0x3f8-0x3f8) for rid 0 of uart0
uart0 failed to probe at port 0x3f8 irq 4 on isa0
pcib0: allocated type 4 (0x2f8-0x2f8) for rid 0 of uart1
uart1 failed to probe at port 0x2f8 irq 3 on isa0
isa_probe_children: probing PnP devices
AcpiOsExecute: task queue not started
AcpiOsExecute: task queue not started
AcpiOsExecute: task queue not started
AcpiOsExecute: task queue not started
hwpstate_intel0: <Intel Speed Shift> on cpu0
hwpstate_intel1: <Intel Speed Shift> on cpu1
hwpstate_intel2: <Intel Speed Shift> on cpu2
hwpstate_intel3: <Intel Speed Shift> on cpu3
Device configuration finished.
procfs registered
Statistical TSC calibration took 86841 us and 16929 data points
Timecounter "TSC-low" frequency 1548013378 Hz quality 1000
Statistical lapic calibration took 8830 us and 34911 data points
lapic: Divisor 2, Frequency 12000103 Hz
lapic: deadline tsc mode, Frequency 3096026757 Hz
Timecounters tick every 1.000 msec
ZFS filesystem version: 5
ZFS storage pool version: features support (5000)
vlan: initialized, using hash tables with chaining
enc0: bpf attached
lo0: bpf attached
IPsec: Initialized Security Association Processing.
tcp_init: net.inet.tcp.tcbhashsize auto tuned to 262144
pflog0: bpf attached
pfsync0: bpf attached
AcpiOsExecute: enqueue 4 pending tasks
ahcich0: AHCI reset...
ugen0.1: <Intel XHCI root HUB> at usbus0
uhub0 on usbus0
ahcich0: SATA offline status=00000004
uhub0: <Intel XHCI root HUB, class 9/0, rev 3.00/1.00, addr 1> on usbus0
ahcich0: AHCI reset: device not found
ahcich1: AHCI reset...
msi: Assigning MSI-X IRQ 135 to local APIC 0 vector 59
msi: Assigning MSI-X IRQ 136 to local APIC 2 vector 52
ahcich1: SATA offline status=00000004
ahcich1: AHCI reset: device not found
ahcich2: AHCI reset...
msi: Assigning MSI-X IRQ 137 to local APIC 4 vector 51
ahcich2: SATA offline status=00000004
ahcich2: AHCI reset: device not found
ahcich3: AHCI reset...
msi: Assigning MSI-X IRQ 138 to local APIC 6 vector 51
ahcich3: SATA offline status=00000004
ahcich3: AHCI reset: device not found
ahcich4: AHCI reset...
ahcich4: SATA offline status=00000004
ahcich4: AHCI reset: device not found
ahcich5: AHCI reset...
ahcich5: SATA offline status=00000004
ahcich5: AHCI reset: device not found
hdacc0: <Realtek ALC235 HDA CODEC> at cad 0 on hdac0
hdaa0: <Realtek ALC235 Audio Function Group> at nid 1 on hdacc0
hdaa0: Subsystem ID: 0x17aa312d
hdaa0: NumGPIO=3 NumGPO=0 NumGPI=0 GPIWake=0 GPIUnsol=1
hdaa0:  GPIO0: disabled
hdaa0:  GPIO1: disabled
hdaa0:  GPIO2: disabled
hdaa0: Original pins configuration:
hdaa0: nid   0x    as seq device       conn  jack    loc        color   misc
hdaa0: 18 40000000 0  0  Line-out      None  Unknown 0x00       Unknown 0
hdaa0: 20 90170110 1  0  Speaker       Fixed Analog  Internal   Unknown 1
hdaa0: 23 411111f0 15 0  Speaker       None  1/8     Rear       Black   1
hdaa0: 24 411111f0 15 0  Speaker       None  1/8     Rear       Black   1
hdaa0: 25 02a11020 2  0  Mic           Jack  1/8     Front      Black   0
hdaa0: 26 02a11030 3  0  Mic           Jack  1/8     Front      Black   0
hdaa0: 27 411111f0 15 0  Speaker       None  1/8     Rear       Black   1
hdaa0: 29 40400001 0  1  SPDIF-out     None  Unknown 0x00       Unknown 0
hdaa0: 30 411111f0 15 0  Speaker       None  1/8     Rear       Black   1
hdaa0: 33 0221101f 1  15 Headphones    Jack  1/8     Front      Black   0
hdaa0: Patching widget caps nid=29 0x00400400 -> 0x00700400
hdaa0: Patched pins configuration:
hdaa0: nid   0x    as seq device       conn  jack    loc        color   misc
hdaa0: 18 40000000 0  0  Line-out      None  Unknown 0x00       Unknown 0 DISA
hdaa0: 20 90170110 1  0  Speaker       Fixed Analog  Internal   Unknown 1
hdaa0: 23 411111f0 15 0  Speaker       None  1/8     Rear       Black   1 DISA
hdaa0: 24 411111f0 15 0  Speaker       None  1/8     Rear       Black   1 DISA
hdaa0: 25 02a11020 2  0  Mic           Jack  1/8     Front      Black   0
hdaa0: 26 02a11030 3  0  Mic           Jack  1/8     Front      Black   0
hdaa0: 27 411111f0 15 0  Speaker       None  1/8     Rear       Black   1 DISA
hdaa0: 30 411111f0 15 0  Speaker       None  1/8     Rear       Black   1 DISA
hdaa0: 33 0221101f 1  15 Headphones    Jack  1/8     Front      Black   0
hdaa0: 3 associations found:
hdaa0: Association 0 (1) out:
hdaa0:  Pin nid=20 seq=0
hdaa0:  Pin nid=33 seq=15
hdaa0: Association 1 (2) in:
hdaa0:  Pin nid=25 seq=0
hdaa0: Association 2 (3) in:
hdaa0:  Pin nid=26 seq=0
hdaa0: Tracing association 0 (1)
hdaa0:  Pin 20 traced to DAC 2
hdaa0:  Pin 33 traced to DAC 2 and hpredir 0
hdaa0: Association 0 (1) trace succeeded
hdaa0: Tracing association 1 (2)
hdaa0:  Pin 25 traced to ADC 8
hdaa0: Association 1 (2) trace succeeded
hdaa0: Tracing association 2 (3)
hdaa0:  Pin 26 traced to ADC 9
hdaa0: Association 2 (3) trace succeeded
hdaa0: Looking for additional DAC for association 0 (1)
hdaa0: Looking for additional ADC for association 1 (2)
hdaa0: Looking for additional ADC for association 2 (3)
hdaa0: Tracing input monitor
hdaa0:  Tracing nid 11 to out
hdaa0:  nid 11 is input monitor
hdaa0:  Tracing nid 34 to out
hdaa0:  Tracing nid 35 to out
hdaa0: Tracing other input monitors
hdaa0:  Tracing nid 25 to out
hdaa0:  Tracing nid 26 to out
hdaa0: Tracing beeper
hdaa0: Headphones redirection for association 0 nid=33 using unsolicited responses.
hdaa0: Redirect output to: main
hdaa0: FG config/quirks: forcestereo ivref50 ivref80 ivref100 ivref
pcm0: <Realtek ALC235 (Analog 2.0+HP/2.0)> at nid 20,33 and 25 on hdaa0
pcm0: Playback:
pcm0:      Stream cap: 0x00000001 PCM
pcm0:         PCM cap: 0x000e0060 16 20 24 bits, 44 48 KHz
pcm0:             DAC: 2
pcm0:
pcm0:     nid=20 [pin: Speaker (Fixed)]
pcm0:       + <- nid=12 [audio mixer] [src: pcm, mix]
pcm0:              + <- nid=2 [audio output] [src: pcm]
pcm0:              + <- nid=11 [audio mixer] [src: mix]
pcm0:
pcm0:     nid=33 [pin: Headphones (Black Jack)]
pcm0:       + <- nid=12 [audio mixer] [src: pcm, mix]
pcm0:              + <- nid=2 [audio output] [src: pcm]
pcm0:              + <- nid=11 [audio mixer] [src: mix]
pcm0:
pcm0: Record:
pcm0:      Stream cap: 0x00000001 PCM
pcm0:         PCM cap: 0x000e0560 16 20 24 bits, 44 48 96 192 KHz
pcm0:             ADC: 8
pcm0:
pcm0:     nid=8 [audio input]
pcm0:       + <- nid=35 [audio mixer] [src: speaker, mic, mix]
pcm0:              + <- nid=25 [pin: Mic (Black Jack)] [src: mic]
pcm0:              + <- nid=29 [beep widget] [src: speaker]
pcm0:              + <- nid=11 [audio mixer] [src: mix]
pcm0:
pcm0: Input Mix:
pcm0:
pcm0:     nid=11 [audio mixer]
pcm0:       + <- nid=25 [pin: Mic (Black Jack)] [src: mic]
pcm0:       + <- nid=29 [beep widget] [src: speaker]
pcm0:
pcm0: Master Volume (OSS: vol): -65/0dB
pcm0:    +- ctl  1 (nid   2 out):    -65/0dB (88 steps)
pcm0:    +- ctl 10 (nid  12 in   0): mute
pcm0:    +- ctl 11 (nid  12 in   1): mute
pcm0:    +- ctl 16 (nid  20 in ):    mute
pcm0:    +- ctl 23 (nid  33 in ):    mute
pcm0:
pcm0: PCM Volume (OSS: pcm): -65/0dB
pcm0:    +- ctl  1 (nid   2 out):    -65/0dB (88 steps)
pcm0:    +- ctl 10 (nid  12 in   0): mute
pcm0:
pcm0: Microphone Volume (OSS: mic): 0/30dB
pcm0:    +- ctl  6 (nid  11 in   1): -34/12dB (32 steps) + mute
pcm0:    +- ctl 19 (nid  25 out):    0/30dB (4 steps)
pcm0:    +- ctl 31 (nid  35 in   1): mute
pcm0:
pcm0: Speaker/Beep Volume (OSS: speaker): -34/12dB
pcm0:    +- ctl  9 (nid  11 in   4): -34/12dB (32 steps) + mute
pcm0:    +- ctl 34 (nid  35 in   4): mute
pcm0:
pcm0: Recording Level (OSS: rec): -17/30dB
pcm0:    +- ctl  3 (nid   8 in   0): -17/30dB (64 steps) + mute
pcm0:    +- ctl 31 (nid  35 in   1): mute
pcm0:    +- ctl 34 (nid  35 in   4): mute
pcm0:    +- ctl 35 (nid  35 in   5): mute
pcm0:
pcm0: Input Mix Level (OSS: mix): -34/12dB
pcm0:    +- ctl  6 (nid  11 in   1): -34/12dB (32 steps) + mute
pcm0:    +- ctl  9 (nid  11 in   4): -34/12dB (32 steps) + mute
pcm0:    +- ctl 11 (nid  12 in   1): mute
pcm0:    +- ctl 35 (nid  35 in   5): mute
pcm0:
pcm0: Input Monitoring Level (OSS: igain): 0/0dB
pcm0:    +- ctl 11 (nid  12 in   1): mute
pcm0:
pcm0: Mixer "vol":
pcm0: Mixer "pcm":
pcm0: Mixer "speaker":
pcm0: Mixer "mic":
pcm0: Mixer "mix":
pcm0: Mixer "rec":
pcm0: Mixer "igain":
pcm0: Mixer "ogain":
pcm0: Playback channel set is: Front Left, Front Right,
pcm0: Playback channel matrix is: 2.0 (unknown)
pcm0: Recording channel set is: Front Left, Front Right,
pcm0: Recording channel matrix is: 2.0 (disconnected)
pcm1: <Realtek ALC235 (Front Analog Mic)> at nid 26 on hdaa0
pcm1: Record:
pcm1:      Stream cap: 0x00000001 PCM
pcm1:         PCM cap: 0x000e0560 16 20 24 bits, 44 48 96 192 KHz
pcm1:             ADC: 9
pcm1:
pcm1:     nid=9 [audio input]
pcm1:       + <- nid=34 [audio mixer] [src: speaker, monitor]
pcm1:              + <- nid=26 [pin: Mic (Black Jack)] [src: monitor]
pcm1:              + <- nid=29 [beep widget] [src: speaker]
pcm1:
pcm1: Microphone2 Volume (OSS: monitor): 0/30dB
pcm1:    +- ctl 20 (nid  26 out):    0/30dB (4 steps)
pcm1:    +- ctl 26 (nid  34 in   2): mute
pcm1:
pcm1: Speaker/Beep Volume (OSS: speaker)
pcm1:    +- ctl 28 (nid  34 in   4): mute
pcm1:
pcm1: Recording Level (OSS: rec): -17/30dB
pcm1:    +- ctl  4 (nid   9 in   0): -17/30dB (64 steps) + mute
pcm1:    +- ctl 20 (nid  26 out):    0/30dB (4 steps)
pcm1:    +- ctl 26 (nid  34 in   2): mute
pcm1:    +- ctl 28 (nid  34 in   4): mute
pcm1:
pcm1: Mixer "rec":
pcm1: Mixer "monitor":
pcm1: Recording channel set is: Front Left, Front Right,
pcm1: Recording channel matrix is: 2.0 (disconnected)
hdacc1: <Intel Kaby Lake HDA CODEC> at cad 2 on hdac0
hdaa1: <Intel Kaby Lake Audio Function Group> at nid 1 on hdacc1
hdaa1: Subsystem ID: 0x80860101
hdaa1: NumGPIO=0 NumGPO=0 NumGPI=0 GPIWake=0 GPIUnsol=0
hdaa1: Original pins configuration:
hdaa1: nid   0x    as seq device       conn  jack    loc        color   misc
hdaa1:  3 18560010 1  0  Digital-out   Jack  Digital 0x18       Unknown 0
hdaa1: Patched pins configuration:
hdaa1: nid   0x    as seq device       conn  jack    loc        color   misc
hdaa1:  3 18560010 1  0  Digital-out   Jack  Digital 0x18       Unknown 0
hdaa1: 1 associations found:
hdaa1: Association 0 (1) out:
hdaa1:  Pin nid=3 seq=0
hdaa1: Tracing association 0 (1)
hdaa1:  Pin 3 traced to DAC 2
hdaa1: Association 0 (1) trace succeeded
hdaa1: Looking for additional DAC for association 0 (1)
hdaa1: Tracing input monitor
hdaa1: Tracing other input monitors
hdaa1: Tracing beeper
hdaa1: FG config/quirks: forcestereo ivref50 ivref80 ivref100 ivref
pcm2: <Intel Kaby Lake (HDMI/DP 8ch)> at nid 3 on hdaa1
pcm2: Playback:
pcm2:      Stream cap: 0x00000005 AC3 PCM
pcm2:         PCM cap: 0x001a07f0 16 24 32 bits, 32 44 48 88 96 176 192 KHz
pcm2:             DAC: 2
pcm2:
pcm2:     nid=3 [pin: Digital-out (Jack)]
pcm2:       + <- nid=2 [audio output] [src: pcm]
pcm2:
pcm2: Master Volume (OSS: vol): 0/0dB
pcm2:    +- ctl  1 (nid   3 in ):    mute
pcm2:
pcm2: PCM Volume (OSS: pcm): 0/0dB
pcm2:    +- ctl  1 (nid   3 in ):    mute
pcm2:
pcm2: Mixer "vol":
pcm2: Mixer "pcm":
pcm2: Soft PCM mixer ENABLED
pcm2: Playback channel matrix is: unknown, assuming 7.1 (disconnected)
pci0: driver added
found-> vendor=0x8086, dev=0x1911, revid=0x00
        domain=0, bus=0, slot=8, func=0
        class=08-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0002, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
        powerspec 2  supports D0 D3  current D0
        MSI supports 1 message
pci0:0:8:0: reprobing on driver added
found-> vendor=0x8086, dev=0xa36f, revid=0x10
        domain=0, bus=0, slot=20, func=2
        class=05-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0002, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        powerspec 3  supports D0 D3  current D0
pci0:0:20:2: reprobing on driver added
found-> vendor=0x8086, dev=0xa360, revid=0x10
        domain=0, bus=0, slot=22, func=0
        class=07-80-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0002, statreg=0x0010, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message, 64 bit
pci0:0:22:0: reprobing on driver added
found-> vendor=0x8086, dev=0xa323, revid=0x10
        domain=0, bus=0, slot=31, func=4
        class=0c-05-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0003, statreg=0x0280, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
pci0:0:31:4: reprobing on driver added
found-> vendor=0x8086, dev=0xa324, revid=0x10
        domain=0, bus=0, slot=31, func=5
        class=0c-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0402, statreg=0x0000, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
pci0:0:31:5: reprobing on driver added
pci1: driver added
pci2: driver added
pci0: driver added
found-> vendor=0x8086, dev=0x1911, revid=0x00
        domain=0, bus=0, slot=8, func=0
        class=08-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0002, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
        powerspec 2  supports D0 D3  current D0
        MSI supports 1 message
pci0:0:8:0: reprobing on driver added
found-> vendor=0x8086, dev=0xa36f, revid=0x10
        domain=0, bus=0, slot=20, func=2
        class=05-00-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0002, statreg=0x0010, cachelnsz=16 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        powerspec 3  supports D0 D3  current D0
pci0:0:20:2: reprobing on driver added
found-> vendor=0x8086, dev=0xa360, revid=0x10
        domain=0, bus=0, slot=22, func=0
        class=07-80-00, hdrtype=0x00, mfdev=1
        cmdreg=0x0002, statreg=0x0010, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
        powerspec 3  supports D0 D3  current D0
        MSI supports 1 message, 64 bit
pci0:0:22:0: reprobing on driver added
found-> vendor=0x8086, dev=0xa323, revid=0x10
        domain=0, bus=0, slot=31, func=4
        class=0c-05-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0003, statreg=0x0280, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
        intpin=a, irq=16
pci0:0:31:4: reprobing on driver added
found-> vendor=0x8086, dev=0xa324, revid=0x10
        domain=0, bus=0, slot=31, func=5
        class=0c-80-00, hdrtype=0x00, mfdev=0
        cmdreg=0x0402, statreg=0x0000, cachelnsz=0 (dwords)
        lattimer=0x00 (0 ns), mingnt=0x00 (0 ns), maxlat=0x00 (0 ns)
pci0:0:31:5: reprobing on driver added
pci1: driver added
pci2: driver added
Trying to mount root from ufs:/dev/ufsid/65d3babf94b3ba92 [rw,noatime]...
uhub0: 22 ports with 22 removable, self powered
Root mount waiting for: usbus0 CAM
ugen0.2: <USB Device USB 2.0 Hub> at usbus0
uhub1 on uhub0
uhub1: <USB Device USB 2.0 Hub, class 9/0, rev 2.00/0.00, addr 1> on usbus0
Root mount waiting for: usbus0 CAM
uhub1: 4 ports with 4 removable, self powered
ugen0.3: <Razer Razer DeathAdder> at usbus0
ugen0.4: <CHICONY HP Basic USB Keyboard> at usbus0
ukbd0 on uhub1
ukbd0: <CHICONY HP Basic USB Keyboard, class 0/0, rev 2.00/1.30, addr 3> on usbus0
kbd2 at ukbd0
kbd2: ukbd0, generic (0), config:0x0, flags:0x3d0000
Root mount waiting for: CAM
Root mount waiting for: CAM
Root mount waiting for: CAM
Root mount waiting for: CAM
Root mount waiting for: CAM
Root mount waiting for: CAM
pass0 at nvme0 bus 0 scbus6 target 0 lun 1
pass0: <SAMSUNG MZVLW256HEHP-000H1 CXB73H1Q S340NA0JA62884>
pass0: Serial Number S340NA0JA62884
pass0: nvme version 1.2
nda0 at nvme0 bus 0 scbus6 target 0 lun 1
nda0: <SAMSUNG MZVLW256HEHP-000H1 CXB73H1Q S340NA0JA62884>
nda0: Serial Number S340NA0JA62884
nda0: nvme version 1.2
nda0: 244198MB (500118192 512 byte sectors)
GEOM: new disk nda0
efirtc0: providing initial system time
start_init: trying /sbin/init
cpuctl: access to MSR registers/cpuid info.
CPU: Intel(R) Core(TM) i3-8100T CPU @ 3.10GHz (3096.03-MHz K8-class CPU)
  Origin="GenuineIntel"  Id=0x906eb  Family=0x6  Model=0x9e  Stepping=11
  Features=0xbfebfbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,CLFLUSH,DTS,ACPI,MMX,FXSR,SSE,SSE2,SS,HTT,TM,PBE>
  Features2=0x7ffafbbf<SSE3,PCLMULQDQ,DTES64,MON,DS_CPL,VMX,EST,TM2,SSSE3,SDBG,FMA,CX16,xTPR,PDCM,PCID,SSE4.1,SSE4.2,x2APIC,MOVBE,POPCNT,TSCDLT,AESNI,XSAVE,OSXSAVE,AVX,F16C,RDRAND>
  AMD Features=0x2c100800<SYSCALL,NX,Page1GB,RDTSCP,LM>
  AMD Features2=0x121<LAHF,ABM,Prefetch>
  Structured Extended Features=0x29c67af<FSGSBASE,TSCADJ,SGX,BMI1,AVX2,SMEP,BMI2,ERMS,INVPCID,NFPUSG,MPX,RDSEED,ADX,SMAP,CLFLUSHOPT,PROCTRACE>
  Structured Extended Features3=0xbc002e00<MCUOPT,MD_CLEAR,TSXFA,IBPB,STIBP,L1DFL,ARCH_CAP,SSBD>
  XSAVE Features=0xf<XSAVEOPT,XSAVEC,XINUSE,XSAVES>
  IA32_ARCH_CAPS=0x2000c04<RSBA>
  VT-x: Basic Features=0xda0400<SMM,INS/OUTS,TRUE>
        Pin-Based Controls=0x7f<ExtINT,NMI,VNMI,PreTmr>
        Primary Processor Controls=0xfff9fffe<INTWIN,TSCOff,HLT,INVLPG,MWAIT,RDPMC,RDTSC,CR3-LD,CR3-ST,CR8-LD,CR8-ST,TPR,NMIWIN,MOV-DR,IO,IOmap,MTF,MSRmap,MONITOR,PAUSE>
        Secondary Processor Controls=0x5fbcff<APIC,EPT,DT,RDTSCP,x2APIC,VPID,WBINVD,UG,PAUSE-loop,RDRAND,INVPCID,VMFUNC,EPT#VE,XSAVES>
        Exit Controls=0xda0400<PAT-LD,EFER-SV,PTMR-SV>
        Entry Controls=0xda0400
        EPT Features=0x6734141<XO,PW4,UC,WB,2M,1G,INVEPT,AD,single,all>
        VPID Features=0xf01<INVVPID,individual,single,all,single-globals>
  TSC: P-state invariant, performance statistics
Data TLB: 2 MByte or 4 MByte pages, 4-way set associative, 32 entries and a separate array with 1 GByte pages, 4-way set associative, 4 entries
Data TLB: 4 KB pages, 4-way set associative, 64 entries
Instruction TLB: 2M/4M pages, fully associative, 8 entries
Instruction TLB: 4KByte pages, 8-way set associative, 128 entries
64-Byte prefetching
Shared 2nd-Level TLB: 4 KByte /2 MByte pages, 6-way associative, 1536 entries. Also 1GBbyte pages, 4-way, 16 entries
L2 cache: 256 kbytes, 8-way associative, 64 bytes/line
