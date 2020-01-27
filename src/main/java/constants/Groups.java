package constants;

public enum Groups {

    no_installment((long) 0),
    single_installment((long) 1),
    wrong_installment(null);

    private Long installment;

    Groups(Long installment){
        this.installment = installment;
    }

    public Long getInstallment(){
        return installment;
    }
}
