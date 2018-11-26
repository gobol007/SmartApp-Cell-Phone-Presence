/**
 *  Virtual Presence Tile
 *
 *  Author: Midyear66
 *
 *  Date: 2015-06-01
 */
metadata {
	// Automatically generated. Make future change here.
	definition (name: "M66 - Presence Virtual Switch", namespace: "Midyear66", author: "bsanford") {
		capability "Switch"
		capability "Presence Sensor"
	}

	// simulator metadata
	simulator {
	}

	// UI tile definitions
	tiles {
		standardTile("switch", "device.switch", width: 2, height: 2, canChangeIcon: true) {
			state "off", label: "Away", action: "switch.on", icon:"st.Home.home2", backgroundColor: "#ffffff"
			state "on", label: "Home", action: "switch.off", icon:"st.Home.home2", backgroundColor: "#53a7c0"
		}
		main "switch"
		details "switch"
	}
}

def parse(String description) {
}

def on() {
  log.debug "Executing 'On Activity'"
	sendEvent(name: "switch", value: "on")
  sendEvent(name: "presence", value: "present")
}

def off() {
  log.debug "Executing 'Off Activity'"
	sendEvent(name: "switch", value: "off")
  sendEvent(name: "presence", value: "not present")
}