package ownradio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ownradio.domain.Device;

public interface DeviceRepository extends JpaRepository<Device, String> {
}
