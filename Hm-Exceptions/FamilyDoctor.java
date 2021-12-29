package com.company;

public class FamilyDoctor extends  Doctor{
    private boolean m_is_occupied;
    private String m_string_clinic;

    public FamilyDoctor(int m_doctor_id, String m_doctor_name, String m_hospital, String m_string_clinic) {
        super(m_doctor_id, m_doctor_name, m_hospital);
        this.m_is_occupied = false;
        this.m_string_clinic = m_string_clinic;
    }

    public boolean isM_is_occupied() {
        return m_is_occupied;
    }

    public String getM_string_clinic() {
        return m_string_clinic;
    }

    public void setM_is_occupied(boolean m_is_occupied) {
        this.m_is_occupied = m_is_occupied;
    }

    public void acceptClient(){
        if(m_is_occupied){
            try {
                throw new DoctorBusyException("The Doctor is busy");
            } catch (DoctorBusyException e) {
                e.printStackTrace();
            }
            // System.out.println("The Doctor is busy...");
        }
        else{
            m_is_occupied = true;
            System.out.println("Welcome");
        }
    }
    public void finishAppointment(){
        m_is_occupied = false;
    }
}
