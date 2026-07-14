public class Cita {
    private String Codigo;
    private String Paciente;
    private String CedulaPaciente;
    private String TelefonoPaciente;
    private String Medico;
    private String Especialidad;
    private String Fecha;
    private String Hora;
    private String MotivoConsulta;
    private String Estado;

    public Cita(String codigo, String paciente, String Cedula, String Telefono, String medico, String especialidad, String fecha, String hora, String Motivo, String estado){

            this.Codigo = codigo;
            this.Paciente = paciente;
            this.CedulaPaciente =Cedula;
            this.TelefonoPaciente =Telefono;
            this.Medico = medico;
            this.Especialidad = especialidad;
            this.Fecha = fecha;
            this.Hora = hora;
            this.MotivoConsulta =Motivo;
            setEstado(estado);
    }




    public void setEstado(String estado){Estado = estado;}
    public String getCodigo(){return Codigo;}
    public String getPaciente() {return Paciente;}
    public String getCedula(){return CedulaPaciente;}
    public String getTelefono(){return TelefonoPaciente;}
    public String getMedico(){return Medico;}
    public String getEspecialidad(){return Especialidad;}
    public String getFecha(){return Fecha;}
    public String getHora(){return Hora;}
    public String getMotivo(){return MotivoConsulta;}
    public String getEstado(){return Estado;}

   

}
