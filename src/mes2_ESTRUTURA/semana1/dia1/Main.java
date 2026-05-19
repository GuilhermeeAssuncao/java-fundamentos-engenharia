package mes2_ESTRUTURA.semana1.dia1;

public class Main {
    public static void main(String[] args) {
        Usuario  u = new Usuario("gfustavo", "gg@gmail.com",12);
        EmailService emailService = new EmailService();
        UsuarioRepository usuarioRepository = new UsuarioRepository();

        usuarioRepository.salvarUsuario(u);
        emailService.boasvindas(u);

        Usuario u2 = new Usuario("maria", "marimari@gmail.com", 23);

        emailService.boasvindas(u2);


    }
}
