package com.mifos.g2p.g2pPaymentConfig;


import com.mifos.g2p.dfsp.Dfsp;
import com.mifos.g2p.governmentEntity.GovernmentEntity;
import com.mifos.g2p.program.Program;
import jakarta.persistence.*;

@Entity
public class G2pPaymentConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "config_id")
    private Long configId;

    @Column(name = "account", nullable = false)
    private String account;

    @Column(name = "status", nullable = false)
    private String Status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gov_inst_id")
    private GovernmentEntity governmentEntity;

    public Dfsp getDfsp() {
        return dfsp;
    }

    public void setDfsp(Dfsp dfsp) {
        this.dfsp = dfsp;
    }

    public GovernmentEntity getGovernmentEntity() {
        return governmentEntity;
    }

    public void setGovernmentEntity(GovernmentEntity governmentEntity) {
        this.governmentEntity = governmentEntity;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fsp_id")
    private Dfsp dfsp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id")
    private Program program;


    public G2pPaymentConfig() {
    }


    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
